package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public interface Cursor extends com.badlogic.gdx.utils.Disposable {

    public enum SystemCursor extends java.lang.Enum<com.badlogic.gdx.graphics.Cursor.SystemCursor> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.Cursor.SystemCursor[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor AllResize = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor Arrow = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor Crosshair = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor Hand = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor HorizontalResize = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor Ibeam = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor NESWResize = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor NWSEResize = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor None = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor NotAllowed = null;
        public static final com.badlogic.gdx.graphics.Cursor.SystemCursor VerticalResize = null;

        static {
                com.badlogic.gdx.graphics.Cursor$SystemCursor r0 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r1 = "Arrow"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.Arrow = r0
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r3 = "Ibeam"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.Ibeam = r1
                com.badlogic.gdx.graphics.Cursor$SystemCursor r3 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r5 = "Crosshair"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.Crosshair = r3
                com.badlogic.gdx.graphics.Cursor$SystemCursor r5 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r7 = "Hand"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.Hand = r5
                com.badlogic.gdx.graphics.Cursor$SystemCursor r7 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r9 = "HorizontalResize"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.HorizontalResize = r7
                com.badlogic.gdx.graphics.Cursor$SystemCursor r9 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r11 = "VerticalResize"
                r12 = 5
                r9.<init>(r11, r12)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.VerticalResize = r9
                com.badlogic.gdx.graphics.Cursor$SystemCursor r11 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r13 = "NWSEResize"
                r14 = 6
                r11.<init>(r13, r14)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.NWSEResize = r11
                com.badlogic.gdx.graphics.Cursor$SystemCursor r13 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r15 = "NESWResize"
                r14 = 7
                r13.<init>(r15, r14)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.NESWResize = r13
                com.badlogic.gdx.graphics.Cursor$SystemCursor r15 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r14 = "AllResize"
                r12 = 8
                r15.<init>(r14, r12)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.AllResize = r15
                com.badlogic.gdx.graphics.Cursor$SystemCursor r14 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r12 = "NotAllowed"
                r10 = 9
                r14.<init>(r12, r10)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.NotAllowed = r14
                com.badlogic.gdx.graphics.Cursor$SystemCursor r12 = new com.badlogic.gdx.graphics.Cursor$SystemCursor
                java.lang.String r10 = "None"
                r8 = 10
                r12.<init>(r10, r8)
                com.badlogic.gdx.graphics.Cursor.SystemCursor.None = r12
                r10 = 11
                com.badlogic.gdx.graphics.Cursor$SystemCursor[] r10 = new com.badlogic.gdx.graphics.Cursor.SystemCursor[r10]
                r10[r2] = r0
                r10[r4] = r1
                r10[r6] = r3
                r0 = 3
                r10[r0] = r5
                r0 = 4
                r10[r0] = r7
                r0 = 5
                r10[r0] = r9
                r0 = 6
                r10[r0] = r11
                r0 = 7
                r10[r0] = r13
                r0 = 8
                r10[r0] = r15
                r0 = 9
                r10[r0] = r14
                r10[r8] = r12
                com.badlogic.gdx.graphics.Cursor.SystemCursor.$VALUES = r10
                return
        }

        SystemCursor(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.Cursor.SystemCursor valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.Cursor$SystemCursor> r0 = com.badlogic.gdx.graphics.Cursor.SystemCursor.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = (com.badlogic.gdx.graphics.Cursor.SystemCursor) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.Cursor.SystemCursor[] values() {
                com.badlogic.gdx.graphics.Cursor$SystemCursor[] r0 = com.badlogic.gdx.graphics.Cursor.SystemCursor.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.Cursor$SystemCursor[] r0 = (com.badlogic.gdx.graphics.Cursor.SystemCursor[]) r0
                return r0
        }
    }
}
