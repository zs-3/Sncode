package com.badlogic.gdx;

/* loaded from: classes.dex */
public interface Application {

    public enum ApplicationType extends java.lang.Enum<com.badlogic.gdx.Application.ApplicationType> {
        private static final /* synthetic */ com.badlogic.gdx.Application.ApplicationType[] $VALUES = null;
        public static final com.badlogic.gdx.Application.ApplicationType Android = null;
        public static final com.badlogic.gdx.Application.ApplicationType Applet = null;
        public static final com.badlogic.gdx.Application.ApplicationType Desktop = null;
        public static final com.badlogic.gdx.Application.ApplicationType HeadlessDesktop = null;
        public static final com.badlogic.gdx.Application.ApplicationType WebGL = null;
        public static final com.badlogic.gdx.Application.ApplicationType iOS = null;

        static {
                com.badlogic.gdx.Application$ApplicationType r0 = new com.badlogic.gdx.Application$ApplicationType
                java.lang.String r1 = "Android"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.Application.ApplicationType.Android = r0
                com.badlogic.gdx.Application$ApplicationType r1 = new com.badlogic.gdx.Application$ApplicationType
                java.lang.String r3 = "Desktop"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.Application.ApplicationType.Desktop = r1
                com.badlogic.gdx.Application$ApplicationType r3 = new com.badlogic.gdx.Application$ApplicationType
                java.lang.String r5 = "HeadlessDesktop"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.Application.ApplicationType.HeadlessDesktop = r3
                com.badlogic.gdx.Application$ApplicationType r5 = new com.badlogic.gdx.Application$ApplicationType
                java.lang.String r7 = "Applet"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.Application.ApplicationType.Applet = r5
                com.badlogic.gdx.Application$ApplicationType r7 = new com.badlogic.gdx.Application$ApplicationType
                java.lang.String r9 = "WebGL"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.Application.ApplicationType.WebGL = r7
                com.badlogic.gdx.Application$ApplicationType r9 = new com.badlogic.gdx.Application$ApplicationType
                java.lang.String r11 = "iOS"
                r12 = 5
                r9.<init>(r11, r12)
                com.badlogic.gdx.Application.ApplicationType.iOS = r9
                r11 = 6
                com.badlogic.gdx.Application$ApplicationType[] r11 = new com.badlogic.gdx.Application.ApplicationType[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.badlogic.gdx.Application.ApplicationType.$VALUES = r11
                return
        }

        ApplicationType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.Application.ApplicationType valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.Application$ApplicationType> r0 = com.badlogic.gdx.Application.ApplicationType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.Application$ApplicationType r1 = (com.badlogic.gdx.Application.ApplicationType) r1
                return r1
        }

        public static com.badlogic.gdx.Application.ApplicationType[] values() {
                com.badlogic.gdx.Application$ApplicationType[] r0 = com.badlogic.gdx.Application.ApplicationType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.Application$ApplicationType[] r0 = (com.badlogic.gdx.Application.ApplicationType[]) r0
                return r0
        }
    }

    void addLifecycleListener(com.badlogic.gdx.LifecycleListener r1);

    void debug(java.lang.String r1, java.lang.String r2);

    void error(java.lang.String r1, java.lang.String r2);

    void error(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3);

    void exit();

    com.badlogic.gdx.ApplicationListener getApplicationListener();

    com.badlogic.gdx.utils.Clipboard getClipboard();

    com.badlogic.gdx.Graphics getGraphics();

    long getJavaHeap();

    com.badlogic.gdx.Preferences getPreferences(java.lang.String r1);

    com.badlogic.gdx.Application.ApplicationType getType();

    void log(java.lang.String r1, java.lang.String r2);

    void postRunnable(java.lang.Runnable r1);

    void removeLifecycleListener(com.badlogic.gdx.LifecycleListener r1);
}
