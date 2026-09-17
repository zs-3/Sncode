package com.badlogic.gdx.assets.loaders;

/* loaded from: classes.dex */
public class ShaderProgramLoader extends com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader<com.badlogic.gdx.graphics.glutils.ShaderProgram, com.badlogic.gdx.assets.loaders.ShaderProgramLoader.ShaderProgramParameter> {
    private java.lang.String fragmentFileSuffix;
    private java.lang.String vertexFileSuffix;

    public static class ShaderProgramParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.glutils.ShaderProgram> {
        public java.lang.String fragmentFile;
        public boolean logOnCompileFailure;
        public java.lang.String prependFragmentCode;
        public java.lang.String prependVertexCode;
        public java.lang.String vertexFile;

        public ShaderProgramParameter() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.logOnCompileFailure = r0
                return
        }
    }

    public ShaderProgramLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = ".vert"
            r0.vertexFileSuffix = r1
            java.lang.String r1 = ".frag"
            r0.fragmentFileSuffix = r1
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r3 = (com.badlogic.gdx.assets.loaders.ShaderProgramLoader.ShaderProgramParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.loaders.ShaderProgramLoader.ShaderProgramParameter r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = (com.badlogic.gdx.assets.loaders.ShaderProgramLoader.ShaderProgramParameter) r4
            r0.loadAsync(r1, r2, r3, r4)
            return
    }

    public void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.ShaderProgramLoader.ShaderProgramParameter r4) {
            r0 = this;
            return
    }

    public com.badlogic.gdx.graphics.glutils.ShaderProgram loadSync(com.badlogic.gdx.assets.AssetManager r6, java.lang.String r7, com.badlogic.gdx.files.FileHandle r8, com.badlogic.gdx.assets.loaders.ShaderProgramLoader.ShaderProgramParameter r9) {
            r5 = this;
            r0 = 0
            if (r9 == 0) goto L11
            java.lang.String r1 = r9.vertexFile
            if (r1 == 0) goto L8
            goto L9
        L8:
            r1 = r0
        L9:
            java.lang.String r2 = r9.fragmentFile
            if (r2 == 0) goto Le
            goto Lf
        Le:
            r2 = r0
        Lf:
            r0 = r1
            goto L12
        L11:
            r2 = r0
        L12:
            r1 = 0
            if (r0 != 0) goto L3d
            java.lang.String r3 = r5.fragmentFileSuffix
            boolean r3 = r7.endsWith(r3)
            if (r3 == 0) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = r7.length()
            java.lang.String r4 = r5.fragmentFileSuffix
            int r4 = r4.length()
            int r3 = r3 - r4
            java.lang.String r3 = r7.substring(r1, r3)
            r0.append(r3)
            java.lang.String r3 = r5.vertexFileSuffix
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L3d:
            if (r2 != 0) goto L67
            java.lang.String r3 = r5.vertexFileSuffix
            boolean r3 = r7.endsWith(r3)
            if (r3 == 0) goto L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r7.length()
            java.lang.String r4 = r5.vertexFileSuffix
            int r4 = r4.length()
            int r3 = r3 - r4
            java.lang.String r1 = r7.substring(r1, r3)
            r2.append(r1)
            java.lang.String r1 = r5.fragmentFileSuffix
            r2.append(r1)
            java.lang.String r2 = r2.toString()
        L67:
            if (r0 != 0) goto L6b
            r0 = r8
            goto L6f
        L6b:
            com.badlogic.gdx.files.FileHandle r0 = r5.resolve(r0)
        L6f:
            if (r2 != 0) goto L72
            goto L76
        L72:
            com.badlogic.gdx.files.FileHandle r8 = r5.resolve(r2)
        L76:
            java.lang.String r1 = r0.readString()
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L82
            r8 = r1
            goto L86
        L82:
            java.lang.String r8 = r8.readString()
        L86:
            if (r9 == 0) goto Lb2
            java.lang.String r0 = r9.prependVertexCode
            if (r0 == 0) goto L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.prependVertexCode
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L9d:
            java.lang.String r0 = r9.prependFragmentCode
            if (r0 == 0) goto Lb2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.prependFragmentCode
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        Lb2:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = new com.badlogic.gdx.graphics.glutils.ShaderProgram
            r0.<init>(r1, r8)
            if (r9 == 0) goto Lbd
            boolean r8 = r9.logOnCompileFailure
            if (r8 == 0) goto Le7
        Lbd:
            boolean r8 = r0.isCompiled()
            if (r8 != 0) goto Le7
            com.badlogic.gdx.utils.Logger r6 = r6.getLogger()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ShaderProgram "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = " failed to compile:\n"
            r8.append(r7)
            java.lang.String r7 = r0.getLog()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.error(r7)
        Le7:
            return r0
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.glutils.ShaderProgram loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader$ShaderProgramParameter r4 = (com.badlogic.gdx.assets.loaders.ShaderProgramLoader.ShaderProgramParameter) r4
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r0.loadSync(r1, r2, r3, r4)
            return r1
    }
}
