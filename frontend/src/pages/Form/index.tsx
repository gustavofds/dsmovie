import { useParams } from "react-router-dom";

function Form(props: any) {
  const { movieId } = useParams();
  return <h1>Página de formulário do filme {movieId}</h1>;
}

export default Form;
