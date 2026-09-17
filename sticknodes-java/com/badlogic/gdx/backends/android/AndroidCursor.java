package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidCursor implements com.badlogic.gdx.graphics.Cursor {

    /* renamed from: com.badlogic.gdx.backends.android.AndroidCursor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor = null;

        static {
                com.badlogic.gdx.graphics.Cursor$SystemCursor[] r0 = com.badlogic.gdx.graphics.Cursor.SystemCursor.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor = r0
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.Arrow     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.Ibeam     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L28
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.Crosshair     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L33
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.Hand     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L3e
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.HorizontalResize     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L49
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.VerticalResize     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L54
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.NWSEResize     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L60
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.NESWResize     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L6c
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.AllResize     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L78
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.NotAllowed     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor     // Catch: java.lang.NoSuchFieldError -> L84
                com.badlogic.gdx.graphics.Cursor$SystemCursor r1 = com.badlogic.gdx.graphics.Cursor.SystemCursor.None     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                return
        }
    }

    public AndroidCursor() {
            r0 = this;
            r0.<init>()
            return
    }

    static void setSystemCursor(android.view.View r2, com.badlogic.gdx.graphics.Cursor.SystemCursor r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L52
            int[] r0 = com.badlogic.gdx.backends.android.AndroidCursor.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Cursor$SystemCursor
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L33;
                case 8: goto L30;
                case 9: goto L2d;
                case 10: goto L2a;
                case 11: goto L28;
                default: goto L11;
            }
        L11:
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown system cursor "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L28:
            r3 = 0
            goto L47
        L2a:
            r3 = 1012(0x3f4, float:1.418E-42)
            goto L47
        L2d:
            r3 = 1013(0x3f5, float:1.42E-42)
            goto L47
        L30:
            r3 = 1016(0x3f8, float:1.424E-42)
            goto L47
        L33:
            r3 = 1017(0x3f9, float:1.425E-42)
            goto L47
        L36:
            r3 = 1015(0x3f7, float:1.422E-42)
            goto L47
        L39:
            r3 = 1014(0x3f6, float:1.421E-42)
            goto L47
        L3c:
            r3 = 1002(0x3ea, float:1.404E-42)
            goto L47
        L3f:
            r3 = 1007(0x3ef, float:1.411E-42)
            goto L47
        L42:
            r3 = 1008(0x3f0, float:1.413E-42)
            goto L47
        L45:
            r3 = 1000(0x3e8, float:1.401E-42)
        L47:
            android.content.Context r0 = r2.getContext()
            android.view.PointerIcon r3 = android.view.PointerIcon.getSystemIcon(r0, r3)
            r2.setPointerIcon(r3)
        L52:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r0 = this;
            return
    }
}
