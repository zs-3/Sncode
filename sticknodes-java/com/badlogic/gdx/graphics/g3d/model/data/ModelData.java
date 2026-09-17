package com.badlogic.gdx.graphics.g3d.model.data;

/* loaded from: classes.dex */
public class ModelData {
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation> animations;
    public java.lang.String id;
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> materials;
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMesh> meshes;
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNode> nodes;
    public final short[] version;

    public ModelData() {
            r1 = this;
            r1.<init>()
            r0 = 2
            short[] r0 = new short[r0]
            r1.version = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.meshes = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.materials = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.nodes = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.animations = r0
            return
    }
}
