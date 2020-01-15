package components;

import types.MaterialType;

public abstract class Component {

    private String name;
    private MaterialType material;

    public Component(String name, MaterialType material){
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }
}
