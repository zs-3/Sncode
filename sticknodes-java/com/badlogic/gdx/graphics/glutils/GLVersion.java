package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class GLVersion {
    private final java.lang.String TAG;
    private int majorVersion;
    private int minorVersion;
    private int releaseVersion;
    private final java.lang.String rendererString;
    private final com.badlogic.gdx.graphics.glutils.GLVersion.Type type;
    private final java.lang.String vendorString;

    public enum Type extends java.lang.Enum<com.badlogic.gdx.graphics.glutils.GLVersion.Type> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.glutils.GLVersion.Type[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.glutils.GLVersion.Type GLES = null;
        public static final com.badlogic.gdx.graphics.glutils.GLVersion.Type NONE = null;
        public static final com.badlogic.gdx.graphics.glutils.GLVersion.Type OpenGL = null;
        public static final com.badlogic.gdx.graphics.glutils.GLVersion.Type WebGL = null;

        static {
                com.badlogic.gdx.graphics.glutils.GLVersion$Type r0 = new com.badlogic.gdx.graphics.glutils.GLVersion$Type
                java.lang.String r1 = "OpenGL"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.glutils.GLVersion.Type.OpenGL = r0
                com.badlogic.gdx.graphics.glutils.GLVersion$Type r1 = new com.badlogic.gdx.graphics.glutils.GLVersion$Type
                java.lang.String r3 = "GLES"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.glutils.GLVersion.Type.GLES = r1
                com.badlogic.gdx.graphics.glutils.GLVersion$Type r3 = new com.badlogic.gdx.graphics.glutils.GLVersion$Type
                java.lang.String r5 = "WebGL"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.graphics.glutils.GLVersion.Type.WebGL = r3
                com.badlogic.gdx.graphics.glutils.GLVersion$Type r5 = new com.badlogic.gdx.graphics.glutils.GLVersion$Type
                java.lang.String r7 = "NONE"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.graphics.glutils.GLVersion.Type.NONE = r5
                r7 = 4
                com.badlogic.gdx.graphics.glutils.GLVersion$Type[] r7 = new com.badlogic.gdx.graphics.glutils.GLVersion.Type[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.badlogic.gdx.graphics.glutils.GLVersion.Type.$VALUES = r7
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.glutils.GLVersion.Type valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.glutils.GLVersion$Type> r0 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.glutils.GLVersion$Type r1 = (com.badlogic.gdx.graphics.glutils.GLVersion.Type) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.glutils.GLVersion.Type[] values() {
                com.badlogic.gdx.graphics.glutils.GLVersion$Type[] r0 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.glutils.GLVersion$Type[] r0 = (com.badlogic.gdx.graphics.glutils.GLVersion.Type[]) r0
                return r0
        }
    }

    public GLVersion(com.badlogic.gdx.Application.ApplicationType r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "GLVersion"
            r2.TAG = r0
            com.badlogic.gdx.Application$ApplicationType r0 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r3 != r0) goto L10
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r3 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.GLES
            r2.type = r3
            goto L38
        L10:
            com.badlogic.gdx.Application$ApplicationType r0 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r3 != r0) goto L19
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r3 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.GLES
            r2.type = r3
            goto L38
        L19:
            com.badlogic.gdx.Application$ApplicationType r0 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r3 != r0) goto L22
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r3 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.OpenGL
            r2.type = r3
            goto L38
        L22:
            com.badlogic.gdx.Application$ApplicationType r0 = com.badlogic.gdx.Application.ApplicationType.Applet
            if (r3 != r0) goto L2b
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r3 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.OpenGL
            r2.type = r3
            goto L38
        L2b:
            com.badlogic.gdx.Application$ApplicationType r0 = com.badlogic.gdx.Application.ApplicationType.WebGL
            if (r3 != r0) goto L34
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r3 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.WebGL
            r2.type = r3
            goto L38
        L34:
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r3 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.NONE
            r2.type = r3
        L38:
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r3 = r2.type
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r0 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.GLES
            java.lang.String r1 = ""
            if (r3 != r0) goto L46
            java.lang.String r3 = "OpenGL ES (\\d(\\.\\d){0,2})"
            r2.extractVersion(r3, r4)
            goto L63
        L46:
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r0 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.WebGL
            if (r3 != r0) goto L50
            java.lang.String r3 = "WebGL (\\d(\\.\\d){0,2})"
            r2.extractVersion(r3, r4)
            goto L63
        L50:
            com.badlogic.gdx.graphics.glutils.GLVersion$Type r0 = com.badlogic.gdx.graphics.glutils.GLVersion.Type.OpenGL
            if (r3 != r0) goto L5a
            java.lang.String r3 = "(\\d(\\.\\d){0,2})"
            r2.extractVersion(r3, r4)
            goto L63
        L5a:
            r3 = -1
            r2.majorVersion = r3
            r2.minorVersion = r3
            r2.releaseVersion = r3
            r5 = r1
            r6 = r5
        L63:
            r2.vendorString = r5
            r2.rendererString = r6
            return
    }

    private void extractVersion(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r0 = r5.find()
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L3e
            r6 = 1
            java.lang.String r5 = r5.group(r6)
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r5.split(r0)
            r0 = r5[r2]
            int r0 = r4.parseInt(r0, r1)
            r4.majorVersion = r0
            int r0 = r5.length
            if (r0 >= r1) goto L28
            r6 = 0
            goto L2e
        L28:
            r6 = r5[r6]
            int r6 = r4.parseInt(r6, r2)
        L2e:
            r4.minorVersion = r6
            int r6 = r5.length
            r0 = 3
            if (r6 >= r0) goto L35
            goto L3b
        L35:
            r5 = r5[r1]
            int r2 = r4.parseInt(r5, r2)
        L3b:
            r4.releaseVersion = r2
            goto L5c
        L3e:
            com.badlogic.gdx.Application r5 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Invalid version string: "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "GLVersion"
            r5.log(r0, r6)
            r4.majorVersion = r1
            r4.minorVersion = r2
            r4.releaseVersion = r2
        L5c:
            return
    }

    private int parseInt(java.lang.String r4, int r5) {
            r3 = this;
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L5
            return r4
        L5:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error parsing number: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", assuming: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "libGDX GL"
            r0.error(r1, r4)
            return r5
    }

    public int getMajorVersion() {
            r1 = this;
            int r0 = r1.majorVersion
            return r0
    }
}
