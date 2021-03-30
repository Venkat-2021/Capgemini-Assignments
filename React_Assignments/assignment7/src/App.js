import './styles/App.css';
import { Header } from './components/Header';
import { WeatherDashboard } from './components/Weather/WeatherDashboard';

function App() {
  return (
    <div>
    <Header title='Weather' />
    <div className="mt-lg-5">
        <div className="col-lg-6 p-0 mx-auto">
            <WeatherDashboard />
        </div>       
    </div>
</div>
  );
}

export default App;
