import { useState, useEffect } from "react";

function App() {
  const [listData, setListData] = useState([]);

  const [name, setName] = useState("witam");
  const [surname, setSurname] = useState("siema");

  useEffect(() => {
    async function getData() {
      const res = await fetch("http://127.0.0.1:8000/aplikacja1/api_lista/");
      const data = await res.json();
      setListData(data);

      console.log(data);
    }

    getData();
  }, []);

  function handleSubmit(e) {
    e.preventDefault();

    console.log(name, surname);
  }

  return (
    <>
      <h1>App</h1>
      {listData && listData.map((item) => <p key={item.id}>{item.imie}</p>)}

      <form onSubmit={handleSubmit}>
        <label htmlFor="imie">Imie</label>
        <input
          type="text"
          id="imie"
          value={name}
          onChange={(e) => setName(e.target.default)}
        />

        <label htmlFor="nazwisko">Nazwisko</label>
        <input
          type="text"
          id="nazwisko"
          value={surname}
          onChange={(e) => setSurname(e.target.default)}
        />

        <button>OK</button>
      </form>
    </>
  );
}

export default App;
