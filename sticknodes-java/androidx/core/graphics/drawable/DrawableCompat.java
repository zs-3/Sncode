package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public final class DrawableCompat {
    private static java.lang.reflect.Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static java.lang.reflect.Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    static class Api19Impl {
        static int getAlpha(android.graphics.drawable.Drawable r0) {
                int r0 = r0.getAlpha()
                return r0
        }

        static android.graphics.drawable.Drawable getChild(android.graphics.drawable.DrawableContainer.DrawableContainerState r0, int r1) {
                android.graphics.drawable.Drawable r0 = r0.getChild(r1)
                return r0
        }

        static android.graphics.drawable.Drawable getDrawable(android.graphics.drawable.InsetDrawable r0) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable()
                return r0
        }

        static boolean isAutoMirrored(android.graphics.drawable.Drawable r0) {
                boolean r0 = r0.isAutoMirrored()
                return r0
        }

        static void setAutoMirrored(android.graphics.drawable.Drawable r0, boolean r1) {
                r0.setAutoMirrored(r1)
                return
        }
    }

    static class Api21Impl {
        static void applyTheme(android.graphics.drawable.Drawable r0, android.content.res.Resources.Theme r1) {
                r0.applyTheme(r1)
                return
        }

        static boolean canApplyTheme(android.graphics.drawable.Drawable r0) {
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        static android.graphics.ColorFilter getColorFilter(android.graphics.drawable.Drawable r0) {
                android.graphics.ColorFilter r0 = r0.getColorFilter()
                return r0
        }

        static void inflate(android.graphics.drawable.Drawable r0, android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
                r0.inflate(r1, r2, r3, r4)
                return
        }

        static void setHotspot(android.graphics.drawable.Drawable r0, float r1, float r2) {
                r0.setHotspot(r1, r2)
                return
        }

        static void setHotspotBounds(android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4) {
                r0.setHotspotBounds(r1, r2, r3, r4)
                return
        }

        static void setTint(android.graphics.drawable.Drawable r0, int r1) {
                r0.setTint(r1)
                return
        }

        static void setTintList(android.graphics.drawable.Drawable r0, android.content.res.ColorStateList r1) {
                r0.setTintList(r1)
                return
        }

        static void setTintMode(android.graphics.drawable.Drawable r0, android.graphics.PorterDuff.Mode r1) {
                r0.setTintMode(r1)
                return
        }
    }

    static class Api23Impl {
        static int getLayoutDirection(android.graphics.drawable.Drawable r0) {
                int r0 = r0.getLayoutDirection()
                return r0
        }

        static boolean setLayoutDirection(android.graphics.drawable.Drawable r0, int r1) {
                boolean r0 = r0.setLayoutDirection(r1)
                return r0
        }
    }

    public static int getLayoutDirection(android.graphics.drawable.Drawable r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r6 = androidx.core.graphics.drawable.DrawableCompat.Api23Impl.getLayoutDirection(r6)
            return r6
        Lb:
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethodFetched
            java.lang.String r1 = "DrawableCompat"
            r2 = 0
            if (r0 != 0) goto L2b
            r0 = 1
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            java.lang.String r4 = "getLayoutDirection"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L23
            androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethod = r3     // Catch: java.lang.NoSuchMethodException -> L23
            r3.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L23
            goto L29
        L23:
            r3 = move-exception
            java.lang.String r4 = "Failed to retrieve getLayoutDirection() method"
            android.util.Log.i(r1, r4, r3)
        L29:
            androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethodFetched = r0
        L2b:
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethod
            if (r0 == 0) goto L45
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3c
            java.lang.Object r6 = r0.invoke(r6, r3)     // Catch: java.lang.Exception -> L3c
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Exception -> L3c
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L3c
            return r6
        L3c:
            r6 = move-exception
            java.lang.String r0 = "Failed to invoke getLayoutDirection() via reflection"
            android.util.Log.i(r1, r0, r6)
            r6 = 0
            androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethod = r6
        L45:
            return r2
    }

    public static boolean isAutoMirrored(android.graphics.drawable.Drawable r0) {
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.Api19Impl.isAutoMirrored(r0)
            return r0
    }

    public static void setAutoMirrored(android.graphics.drawable.Drawable r0, boolean r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api19Impl.setAutoMirrored(r0, r1)
            return
    }

    public static boolean setLayoutDirection(android.graphics.drawable.Drawable r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r7 = androidx.core.graphics.drawable.DrawableCompat.Api23Impl.setLayoutDirection(r7, r8)
            return r7
        Lb:
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethodFetched
            java.lang.String r1 = "DrawableCompat"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L2f
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.String r4 = "setLayoutDirection"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L27
            r5[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L27
            androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethod = r0     // Catch: java.lang.NoSuchMethodException -> L27
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L27
            goto L2d
        L27:
            r0 = move-exception
            java.lang.String r4 = "Failed to retrieve setLayoutDirection(int) method"
            android.util.Log.i(r1, r4, r0)
        L2d:
            androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethodFetched = r3
        L2f:
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethod
            if (r0 == 0) goto L48
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L3f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L3f
            r4[r2] = r8     // Catch: java.lang.Exception -> L3f
            r0.invoke(r7, r4)     // Catch: java.lang.Exception -> L3f
            return r3
        L3f:
            r7 = move-exception
            java.lang.String r8 = "Failed to invoke setLayoutDirection(int) via reflection"
            android.util.Log.i(r1, r8, r7)
            r7 = 0
            androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethod = r7
        L48:
            return r2
    }

    public static void setTintList(android.graphics.drawable.Drawable r0, android.content.res.ColorStateList r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTintList(r0, r1)
            return
    }

    public static void setTintMode(android.graphics.drawable.Drawable r0, android.graphics.PorterDuff.Mode r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTintMode(r0, r1)
            return
    }

    public static android.graphics.drawable.Drawable wrap(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L7
            return r2
        L7:
            boolean r0 = r2 instanceof androidx.core.graphics.drawable.TintAwareDrawable
            if (r0 != 0) goto L11
            androidx.core.graphics.drawable.WrappedDrawableApi21 r0 = new androidx.core.graphics.drawable.WrappedDrawableApi21
            r0.<init>(r2)
            return r0
        L11:
            return r2
    }
}
