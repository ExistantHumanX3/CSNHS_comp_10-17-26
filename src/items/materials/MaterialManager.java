package items.materials;

import helpers.Identifier;
import helpers.Map;

import java.util.HashMap;

public class MaterialManager {


    public enum Materials {
        WOOD,
        STONE,
        IRON,
        CRYSTAL,
        DIAMOND,
        GOLD
    }

    private final Map<Materials, String> names = new Map<>();
    private final Map<Materials, Identifier> ids = new Map<>();

    private final HashMap<Materials, Material> materials = new HashMap<>();

    public static void init() {
        System.out.println("Initializing Materials");
    }

    public void createMaterial(String name, Materials materialType, Material material) {
        names.put(materialType, name);
        ids.put(materialType, new Identifier(name, "Materials"));

        materials.put(materialType, material);
    }
    public Material getMaterial(Materials material) {
        return materials.get(material);
    }
    public Material getMaterial(Identifier id) {
        return materials.get(ids.getValue(id));
    }
    public Material getMaterial(String name) {
        return materials.get(names.getValue(name));
    }



}
