package items.materials;

import helpers.Identifier;
import helpers.Translateable;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Material implements Translateable {

    private Identifier id;
    private MaterialManager.Materials materialType;

    public Material(Identifier id, MaterialManager.Materials materialType) {
        this.materialType = materialType;
        this.id = id;
    }

    public String getName() {
        return this.translate("en");
    }

    @Override
    public String translate(String language) {
        String path;

        switch(language) {
            case "en": {
                path = "src/assets/data/lang/en.json";
                break;
            }
            case "de": {
                path = "src/assets/data/lang/de.json";
                break;
            }
            default: return "LANG_ERROR";
        }
        try {
            Object obj = new JSONParser().parse(new FileReader(path));
            JSONObject jo = (JSONObject) obj;

            return (String) jo.get(this.id.getId());

        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
