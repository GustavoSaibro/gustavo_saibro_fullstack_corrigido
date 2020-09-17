import React, { Component } from "react";

import axios from "axios";

const FATORIAL_REST_API_URL = "http://localhost:8080/api/fatorials";

class FatorialComponent extends Component {
  constructor(props) {
    super(props);

    this.state = {
      number: "",
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }
  handleChange(event) {
    this.setState({ number: event.target.number });
  }
  handleSubmit(event) {
    alert("Um numero foi enviado: " + this.state.number);
    event.preventDefault();
  }

  addFatorial(number) {
    axios.post(FATORIAL_REST_API_URL, number);
  }

  componentDidMount() {
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  render() {
    return (
      <div className="row">
        <div className="text-center">
          <form
            onSubmit={this.handleSubmit}
            onChange={this.handleChange}
            number={this.state.number}
          >
            <div className="form-group">
              <label>Calculate your fatorial here: </label>
              <input
                type="number"
                className="form-control"
                onChange={this.handleChange}
                number={this.state.number}
              ></input>
              <button
                className="btn btn-primary"
                onClick={this.addFatorial(this.number)}
              >
                calculate
              </button>
            </div>
          </form>
        </div>
      </div>
    );
  }
}

export default FatorialComponent;
