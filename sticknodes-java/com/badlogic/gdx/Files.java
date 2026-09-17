package com.badlogic.gdx;

/* loaded from: classes.dex */
public interface Files {

    public enum FileType extends java.lang.Enum<com.badlogic.gdx.Files.FileType> {
        private static final /* synthetic */ com.badlogic.gdx.Files.FileType[] $VALUES = null;
        public static final com.badlogic.gdx.Files.FileType Absolute = null;
        public static final com.badlogic.gdx.Files.FileType Classpath = null;
        public static final com.badlogic.gdx.Files.FileType External = null;
        public static final com.badlogic.gdx.Files.FileType Internal = null;
        public static final com.badlogic.gdx.Files.FileType Local = null;

        static {
                com.badlogic.gdx.Files$FileType r0 = new com.badlogic.gdx.Files$FileType
                java.lang.String r1 = "Classpath"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.Files.FileType.Classpath = r0
                com.badlogic.gdx.Files$FileType r1 = new com.badlogic.gdx.Files$FileType
                java.lang.String r3 = "Internal"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.Files.FileType.Internal = r1
                com.badlogic.gdx.Files$FileType r3 = new com.badlogic.gdx.Files$FileType
                java.lang.String r5 = "External"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.Files.FileType.External = r3
                com.badlogic.gdx.Files$FileType r5 = new com.badlogic.gdx.Files$FileType
                java.lang.String r7 = "Absolute"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.Files.FileType.Absolute = r5
                com.badlogic.gdx.Files$FileType r7 = new com.badlogic.gdx.Files$FileType
                java.lang.String r9 = "Local"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.Files.FileType.Local = r7
                r9 = 5
                com.badlogic.gdx.Files$FileType[] r9 = new com.badlogic.gdx.Files.FileType[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.badlogic.gdx.Files.FileType.$VALUES = r9
                return
        }

        FileType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.Files.FileType valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.Files$FileType> r0 = com.badlogic.gdx.Files.FileType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.Files$FileType r1 = (com.badlogic.gdx.Files.FileType) r1
                return r1
        }

        public static com.badlogic.gdx.Files.FileType[] values() {
                com.badlogic.gdx.Files$FileType[] r0 = com.badlogic.gdx.Files.FileType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.Files$FileType[] r0 = (com.badlogic.gdx.Files.FileType[]) r0
                return r0
        }
    }

    com.badlogic.gdx.files.FileHandle absolute(java.lang.String r1);

    com.badlogic.gdx.files.FileHandle classpath(java.lang.String r1);

    com.badlogic.gdx.files.FileHandle external(java.lang.String r1);

    java.lang.String getExternalStoragePath();

    com.badlogic.gdx.files.FileHandle getFileHandle(java.lang.String r1, com.badlogic.gdx.Files.FileType r2);

    java.lang.String getLocalStoragePath();

    com.badlogic.gdx.files.FileHandle internal(java.lang.String r1);

    boolean isExternalStorageAvailable();
}
