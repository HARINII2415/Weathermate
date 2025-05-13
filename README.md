<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>WeatherMate - README</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #fdfdfd;
      color: #333;
      margin: 2rem;
      line-height: 1.6;
    }
    h1, h2 {
      color: #0a84ff;
    }
    code {
      background-color: #f2f2f2;
      padding: 2px 4px;
      border-radius: 4px;
      font-size: 90%;
    }
    pre {
      background: #eee;
      padding: 10px;
      border-radius: 6px;
      overflow-x: auto;
    }
    a {
      color: #0a84ff;
      text-decoration: none;
    }
    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 1em;
    }
    th, td {
      padding: 8px;
      border: 1px solid #ccc;
      text-align: left;
    }
    ul {
      padding-left: 1.4em;
    }
  </style>
</head>
<body>

  <h1>🌦️ WeatherMate</h1>

  <p><strong>WeatherMate</strong> is a simple and user-friendly weather application developed using <strong>Java</strong>. It fetches real-time weather data from the <strong>OpenWeatherMap API</strong> and displays key information like temperature, humidity, and wind speed based on the user’s selected city.</p>

  <p>🔗 <strong>Live Demo:</strong> <a href="https://weathermate-app-k6hg.onrender.com/" target="_blank">Click here to view the deployed app</a></p>

  <h2>🔍 Features</h2>
  <ul>
    <li>🔎 City-Based Weather Search</li>
    <li>🌡️ Real-Time Weather Info</li>
    <li>💡 Interactive Java GUI (Swing/AWT)</li>
    <li>🔄 Live API Integration</li>
  </ul>

  <h2>🌐 Live App Overview</h2>
  <ul>
    <li>Simple input box to fetch weather by city</li>
    <li>Fast response and minimal UI</li>
    <li>Hosted using Render.com</li>
  </ul>

  <h2>💻 Tech Stack</h2>
  <table>
    <tr>
      <th>Technology</th>
      <th>Usage</th>
    </tr>
    <tr><td>Java</td><td>Core backend logic and GUI</td></tr>
    <tr><td>Swing / AWT</td><td>Frontend interface (Java GUI)</td></tr>
    <tr><td>OpenWeatherMap</td><td>API for real-time weather</td></tr>
    <tr><td>Maven</td><td>Build and dependency management</td></tr>
    <tr><td>Render</td><td>Hosting and deployment</td></tr>
  </table>

  <h2>⚙️ Installation & Setup</h2>
  <pre><code># Clone the repository
git clone https://github.com/HARINII2415/weathermate.git
cd weathermate
</code></pre>
  <ol>
    <li>Open the project in IntelliJ IDEA / Eclipse</li>
    <li>Get API key from <a href="https://openweathermap.org/api" target="_blank">OpenWeatherMap</a></li>
    <li>Paste it into your configuration file (e.g., Constants.java)</li>
    <li>Run <code>Main.java</code></li>
  </ol>

  <h2>🚀 Future Improvements</h2>
  <ul>
    <li>📅 7-day forecast</li>
    <li>📍 Location auto-detection</li>
    <li>🗺️ Weather map integration</li>
    <li>🎨 Better UI and icon support</li>
    <li>💬 Error message handling</li>
  </ul>

  <h2>🤝 Contributing</h2>
  <p>Pull requests are welcome. Open an issue first to discuss any major changes.</p>

  <h2>📄 License</h2>
  <p>This project is licensed under the MIT License.</p>

</body>
</html>
