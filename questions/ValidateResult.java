
    //Nos permite validar si el ResultadoEsperado que enviamos de la data es igual a la respuesta que obtuvimos
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Resul = Text.of(INPUT_RESPUESTA).viewedBy(actor).asString();
        if (resultData.get(0).getResultadoEperado().equals(Resul)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

