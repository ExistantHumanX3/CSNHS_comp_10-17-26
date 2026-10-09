package items.materials;

import helpers.Identifier;
import helpers.Map;


public class MaterialManager {

    public enum Materials {
        WOOD,
        STONE,
        IRON,
        CRYSTAL,
        DIAMOND,
        GOLD
    }

    public static final Map<Materials, String> names = new Map<>();
    public static final Map<Materials, Identifier> ids = new Map<>();

    public static final Map<Materials, Material> materials = new Map<>();


    // Material Creation Here
    public static final Material WOOD = createMaterial("wood", Materials.WOOD);
    public static final Material STONE = createMaterial("stone", Materials.STONE);
    public static final Material IRON = createMaterial("iron", Materials.IRON);
    public static final Material CRYSTAL = createMaterial("crystal", Materials.CRYSTAL);
    public static final Material DIAMOND = createMaterial("diamond", Materials.DIAMOND);
    public static final Material GOLD = createMaterial("gold", Materials.GOLD);


    public static void init() {
        System.out.println("Initializing Materials");
    }

    private static Material createMaterial(String name, Materials materialType) {
        names.put(materialType, name);

        Identifier id = new Identifier(name, "Materials");
        ids.put(materialType, id);

        Material material = new Material(id, materialType);
        materials.put(materialType, material);

        return material;
    }
    public Material getMaterial(Materials material) {
        return materials.getKey(material);
    }
    public Material getMaterial(Identifier id) {
        return materials.getKey(ids.getValue(id));
    }
    public Material getMaterial(String name) {
        return materials.getKey(names.getValue(name));
    }


    public Identifier getId(Materials materialType) {
        return ids.getKey(materialType);
    }
    public Identifier getId(String name) {
        return ids.getKey(names.getValue(name));
    }
    public Identifier getId(Material material) {
        return ids.getKey(materials.getValue(material));
    }


}
