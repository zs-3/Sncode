package com.badlogic.gdx.graphics.g3d.particles;

/* loaded from: classes.dex */
public class ResourceData<T> implements com.badlogic.gdx.utils.Json.Serializable {
    private int currentLoadIndex;
    private com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData> data;
    public T resource;
    com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ResourceData.AssetData> sharedAssets;
    private com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData> uniqueData;

    public static class AssetData<T> implements com.badlogic.gdx.utils.Json.Serializable {
        public java.lang.String filename;
        public java.lang.Class<T> type;

        public AssetData() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.utils.Json.Serializable
        public void read(com.badlogic.gdx.utils.Json r4, com.badlogic.gdx.utils.JsonValue r5) {
                r3 = this;
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                java.lang.String r1 = "filename"
                java.lang.Object r1 = r4.readValue(r1, r0, r5)
                java.lang.String r1 = (java.lang.String) r1
                r3.filename = r1
                java.lang.String r1 = "type"
                java.lang.Object r4 = r4.readValue(r1, r0, r5)
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Class r5 = com.badlogic.gdx.utils.reflect.ClassReflection.forName(r4)     // Catch: com.badlogic.gdx.utils.reflect.ReflectionException -> L1b
                r3.type = r5     // Catch: com.badlogic.gdx.utils.reflect.ReflectionException -> L1b
                return
            L1b:
                r5 = move-exception
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Class not found: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4, r5)
                throw r0
        }
    }

    public static class SaveData implements com.badlogic.gdx.utils.Json.Serializable {
        com.badlogic.gdx.utils.IntArray assets;
        com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object> data;
        private int loadIndex;
        protected com.badlogic.gdx.graphics.g3d.particles.ResourceData resources;

        public SaveData() {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
                r0.<init>()
                r1.data = r0
                com.badlogic.gdx.utils.IntArray r0 = new com.badlogic.gdx.utils.IntArray
                r0.<init>()
                r1.assets = r0
                r0 = 0
                r1.loadIndex = r0
                return
        }

        @Override // com.badlogic.gdx.utils.Json.Serializable
        public void read(com.badlogic.gdx.utils.Json r4, com.badlogic.gdx.utils.JsonValue r5) {
                r3 = this;
                java.lang.Class<com.badlogic.gdx.utils.ObjectMap> r0 = com.badlogic.gdx.utils.ObjectMap.class
                java.lang.String r1 = "data"
                java.lang.Object r0 = r4.readValue(r1, r0, r5)
                com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0
                r3.data = r0
                com.badlogic.gdx.utils.IntArray r0 = r3.assets
                java.lang.Class<int[]> r1 = int[].class
                java.lang.String r2 = "indices"
                java.lang.Object r4 = r4.readValue(r2, r1, r5)
                int[] r4 = (int[]) r4
                r0.addAll(r4)
                return
        }
    }

    public ResourceData() {
            r4 = this;
            r4.<init>()
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            r4.uniqueData = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.ResourceData$SaveData> r1 = com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData.class
            r2 = 1
            r3 = 3
            r0.<init>(r2, r3, r1)
            r4.data = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r4.sharedAssets = r0
            r0 = 0
            r4.currentLoadIndex = r0
            return
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ResourceData.AssetData> getAssets() {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ResourceData$AssetData> r0 = r1.sharedAssets
            return r0
    }

    @Override // com.badlogic.gdx.utils.Json.Serializable
    public void read(com.badlogic.gdx.utils.Json r5, com.badlogic.gdx.utils.JsonValue r6) {
            r4 = this;
            java.lang.Class<com.badlogic.gdx.utils.ObjectMap> r0 = com.badlogic.gdx.utils.ObjectMap.class
            java.lang.String r1 = "unique"
            java.lang.Object r0 = r5.readValue(r1, r0, r6)
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0
            r4.uniqueData = r0
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r0.entries()
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.utils.ObjectMap$Entry r1 = (com.badlogic.gdx.utils.ObjectMap.Entry) r1
            V r1 = r1.value
            com.badlogic.gdx.graphics.g3d.particles.ResourceData$SaveData r1 = (com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData) r1
            r1.resources = r4
            goto L14
        L27:
            java.lang.Class<com.badlogic.gdx.utils.Array> r0 = com.badlogic.gdx.utils.Array.class
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.ResourceData$SaveData> r1 = com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData.class
            java.lang.String r2 = "data"
            java.lang.Object r0 = r5.readValue(r2, r0, r1, r6)
            com.badlogic.gdx.utils.Array r0 = (com.badlogic.gdx.utils.Array) r0
            r4.data = r0
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L39:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.g3d.particles.ResourceData$SaveData r1 = (com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData) r1
            r1.resources = r4
            goto L39
        L48:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ResourceData$AssetData> r0 = r4.sharedAssets
            java.lang.Class<com.badlogic.gdx.utils.Array> r1 = com.badlogic.gdx.utils.Array.class
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.ResourceData$AssetData> r2 = com.badlogic.gdx.graphics.g3d.particles.ResourceData.AssetData.class
            java.lang.String r3 = "assets"
            java.lang.Object r1 = r5.readValue(r3, r1, r2, r6)
            com.badlogic.gdx.utils.Array r1 = (com.badlogic.gdx.utils.Array) r1
            r0.addAll(r1)
            r0 = 0
            java.lang.String r1 = "resource"
            java.lang.Object r5 = r5.readValue(r1, r0, r6)
            r4.resource = r5
            return
    }
}
