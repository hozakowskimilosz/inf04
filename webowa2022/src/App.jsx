import { useState } from "react";

function App() {
  const [courses, setCourses] = useState([
    "Programowanie w C#",
    "Angular dla początkujących",
    "Kurs Django",
  ]);

  const [name, setName] = useState("");
  const [number, setNumber] = useState("");

  function handleSubmit(e) {
    e.preventDefault();

    console.log(name);

    if (courses[number - 1] == undefined) {
      console.log("Nieprawidłowy numer kursu");
      return;
    } else {
      console.log(courses[number - 1]);
    }
  }

  return (
    <>
      <h2>Liczba kursów: {courses.length}</h2>

      <ol>
        {courses.map((course, idx) => {
          return <li key={idx}>{course}</li>;
        })}
      </ol>

      <form>
        <div className="form-group">
          <label htmlFor="name">Imię i nazwisko:</label>
          <input
            type="text"
            id="name"
            value={name}
            onChange={(e) => setName(e.target.value)}
            className="form-control"
          />
        </div>

        <div className="form-group">
          <label htmlFor="number">Numer kursu:</label>
          <input
            type="text"
            id="number"
            value={number}
            onChange={(e) => setNumber(e.target.value)}
            className="form-control"
          />
        </div>

        <button onClick={handleSubmit} className="btn btn-primary">
          Submit
        </button>
      </form>
    </>
  );
}

export default App;
