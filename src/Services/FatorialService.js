import axios from "axios";

const FATORIAL_REST_API_URL = "http://localhost:8080/api/fatorials";

class FatorialService {
  getFatorial() {
    return axios.get(FATORIAL_REST_API_URL);
  }
}
export default new FatorialService();
