import React, { Component } from "react";
//import axios from "axios";
import NumberComponent from "./NumberComponent";
import FatorialService from "../Services/FatorialService";
//const FATORIAL_REST_API_URL = "http://localhost:8080/api/fatorials";

class FatorialComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fatorials: [],
    };
  }

  componentDidMount() {
    // axios.get(FATORIAL_REST_API_URL).then((response) => {
    //   this.setState({ fatorials: response.data });
    // });
    FatorialService.getFatorial()
      .then((response) => {
        this.setState({ fatorials: response.data });
      })
      .catch((error) => {
        console.log(error);
      });
  }

  render() {
    return (
      <div>
        <div className="container">
          <h1>Fatorial Calculator</h1>
          <NumberComponent />
          <div className="row">
            <h2 className="text-center">Fatorial List</h2>
            <table className="table table-striped">
              <thead>
                <tr>
                  <td>Number</td>
                  <td>Fatorial</td>
                </tr>
              </thead>
              <tbody>
                {this.state.fatorials.map((fatorial) => (
                  <tr key={fatorial.id}>
                    <td>{fatorial.number}</td>
                    <td>{fatorial.fatorial}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    );
  }
}

export default FatorialComponent;
