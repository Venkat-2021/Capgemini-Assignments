
import './App.css';
import { BrowserRouter as Router, Link, NavLink } from 'react-router-dom';
import Route from 'react-router-dom/Route';
import home from './components/home';

const Projects = () =>{
  return(<h1>You Choose Projects</h1>)
}
const Services = () =>{
  return(<h1>You Choose Services</h1>)
}
const Contact = () =>{
  return(<h1>You Choose Contact</h1>)
}

function App() {
  return (
    <Router>
    <div className="App">
      <nav>
      <ul>
      <li>
        <NavLink to = "/" exact activeStyle={{color:'blue'}} ><a>HOME</a></NavLink>
      </li>
      <li>
        <NavLink to = "/projects" exact activeStyle={{color:'blue'}}><a>PROJECTS</a></NavLink>
      </li>
      <li>
        <NavLink to = "/services" exact activeStyle={{color:'blue'}}><a>SERVICES</a></NavLink>
      </li>
      <li>
        <NavLink to = "/contact" exact activeStyle={{color:'blue'}}><a>CONTACT</a></NavLink>
      </li>
    </ul> 
      </nav>

    <Route path="/" exact component={home} />
      <Route path="/projects" exact component={Projects}  />
      <Route path="/services" exact component={Services} />
      <Route path="/contact" exact component={Contact} />
      
    </div>
    </Router>
  );
}

export default App;
