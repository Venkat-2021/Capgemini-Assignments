import React, { Component } from 'react';
import './styles/App.css';
import Clock from './components/Clock';
import Header from './components/Header';
import Panel from './components/Panel';
import Display from './components/Display';


 class App extends Component {

  constructor() {
      super();

      this.state = {
          title: 'React Clock'
      };
  }

  render() {
      return (
          <div>
              <Header title={this.state.title} />
              <Clock />
          </div>
      );
  }
}

export default App;
