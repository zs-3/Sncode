package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = null;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    java.lang.Object mObj1;
    public android.os.Parcelable mParcelable;
    public java.lang.String mString1;
    public android.content.res.ColorStateList mTintList;
    android.graphics.PorterDuff.Mode mTintMode;
    public java.lang.String mTintModeStr;
    public int mType;

    static class Api23Impl {
        static androidx.core.graphics.drawable.IconCompat createFromIconInner(java.lang.Object r2) {
                androidx.core.util.Preconditions.checkNotNull(r2)
                int r0 = getType(r2)
                r1 = 2
                if (r0 == r1) goto L2b
                r1 = 4
                if (r0 == r1) goto L22
                r1 = 6
                if (r0 == r1) goto L19
                androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
                r1 = -1
                r0.<init>(r1)
                r0.mObj1 = r2
                return r0
            L19:
                android.net.Uri r2 = getUri(r2)
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmapContentUri(r2)
                return r2
            L22:
                android.net.Uri r2 = getUri(r2)
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithContentUri(r2)
                return r2
            L2b:
                r0 = 0
                java.lang.String r1 = getResPackage(r2)
                int r2 = getResId(r2)
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithResource(r0, r1, r2)
                return r2
        }

        static int getResId(java.lang.Object r6) {
                java.lang.String r0 = "Unable to get icon resource"
                java.lang.String r1 = "IconCompat"
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 28
                if (r2 < r3) goto Lf
                int r6 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getResId(r6)
                return r6
            Lf:
                r2 = 0
                java.lang.Class r3 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.String r4 = "getResId"
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.Object r6 = r3.invoke(r6, r4)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                int r6 = r6.intValue()     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                return r6
            L29:
                r6 = move-exception
                android.util.Log.e(r1, r0, r6)
                return r2
            L2e:
                r6 = move-exception
                android.util.Log.e(r1, r0, r6)
                return r2
            L33:
                r6 = move-exception
                android.util.Log.e(r1, r0, r6)
                return r2
        }

        static java.lang.String getResPackage(java.lang.Object r7) {
                java.lang.String r0 = "Unable to get icon package"
                java.lang.String r1 = "IconCompat"
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 28
                if (r2 < r3) goto Lf
                java.lang.String r7 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getResPackage(r7)
                return r7
            Lf:
                r2 = 0
                java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.String r4 = "getResPackage"
                r5 = 0
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.Object r7 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                return r7
            L26:
                r7 = move-exception
                android.util.Log.e(r1, r0, r7)
                return r2
            L2b:
                r7 = move-exception
                android.util.Log.e(r1, r0, r7)
                return r2
            L30:
                r7 = move-exception
                android.util.Log.e(r1, r0, r7)
                return r2
        }

        static int getType(java.lang.Object r7) {
                java.lang.String r0 = "Unable to get icon type "
                java.lang.String r1 = "IconCompat"
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 28
                if (r2 < r3) goto Lf
                int r7 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getType(r7)
                return r7
            Lf:
                r2 = -1
                java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L52
                java.lang.String r4 = "getType"
                r5 = 0
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L52
                java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L52
                java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L52
                java.lang.Object r3 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L52
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L52
                int r7 = r3.intValue()     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L52
                return r7
            L2a:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r7)
                java.lang.String r7 = r4.toString()
                android.util.Log.e(r1, r7, r3)
                return r2
            L3e:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r7)
                java.lang.String r7 = r4.toString()
                android.util.Log.e(r1, r7, r3)
                return r2
            L52:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r7)
                java.lang.String r7 = r4.toString()
                android.util.Log.e(r1, r7, r3)
                return r2
        }

        static android.net.Uri getUri(java.lang.Object r7) {
                java.lang.String r0 = "Unable to get icon uri"
                java.lang.String r1 = "IconCompat"
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 28
                if (r2 < r3) goto Lf
                android.net.Uri r7 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getUri(r7)
                return r7
            Lf:
                r2 = 0
                java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.String r4 = "getUri"
                r5 = 0
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.Object r7 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                android.net.Uri r7 = (android.net.Uri) r7     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                return r7
            L26:
                r7 = move-exception
                android.util.Log.e(r1, r0, r7)
                return r2
            L2b:
                r7 = move-exception
                android.util.Log.e(r1, r0, r7)
                return r2
            L30:
                r7 = move-exception
                android.util.Log.e(r1, r0, r7)
                return r2
        }

        static android.graphics.drawable.Drawable loadDrawable(android.graphics.drawable.Icon r0, android.content.Context r1) {
                android.graphics.drawable.Drawable r0 = r0.loadDrawable(r1)
                return r0
        }

        static android.graphics.drawable.Icon toIcon(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
                int r0 = r4.mType
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lcc;
                    case 0: goto L8;
                    case 1: goto Lb3;
                    case 2: goto La8;
                    case 3: goto L9b;
                    case 4: goto L92;
                    case 5: goto L78;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.getUri()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.Api30Impl.createWithAdaptiveBitmapContentUri(r5)
                goto Lbb
            L20:
                if (r5 == 0) goto L5d
                java.io.InputStream r5 = r4.getUriInputStream(r5)
                if (r5 == 0) goto L42
                if (r0 < r2) goto L34
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.Api26Impl.createWithAdaptiveBitmap(r5)
                goto Lbb
            L34:
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.createLegacyIconFromAdaptiveIcon(r5, r1)
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
                goto Lbb
            L42:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.getUri()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L5d:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.getUri()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L78:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L85
                java.lang.Object r5 = r4.mObj1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.Api26Impl.createWithAdaptiveBitmap(r5)
                goto Lbb
            L85:
                java.lang.Object r5 = r4.mObj1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.createLegacyIconFromAdaptiveIcon(r5, r1)
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
                goto Lbb
            L92:
                java.lang.Object r5 = r4.mObj1
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto Lbb
            L9b:
                java.lang.Object r5 = r4.mObj1
                byte[] r5 = (byte[]) r5
                int r0 = r4.mInt1
                int r1 = r4.mInt2
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto Lbb
            La8:
                java.lang.String r5 = r4.getResPackage()
                int r0 = r4.mInt1
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto Lbb
            Lb3:
                java.lang.Object r5 = r4.mObj1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            Lbb:
                android.content.res.ColorStateList r0 = r4.mTintList
                if (r0 == 0) goto Lc2
                r5.setTintList(r0)
            Lc2:
                android.graphics.PorterDuff$Mode r4 = r4.mTintMode
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
                if (r4 == r0) goto Lcb
                r5.setTintMode(r4)
            Lcb:
                return r5
            Lcc:
                java.lang.Object r4 = r4.mObj1
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
        }
    }

    static class Api26Impl {
        static android.graphics.drawable.Drawable createAdaptiveIconDrawable(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2) {
                android.graphics.drawable.AdaptiveIconDrawable r0 = new android.graphics.drawable.AdaptiveIconDrawable
                r0.<init>(r1, r2)
                return r0
        }

        static android.graphics.drawable.Icon createWithAdaptiveBitmap(android.graphics.Bitmap r0) {
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r0)
                return r0
        }
    }

    static class Api28Impl {
        static int getResId(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                int r0 = r0.getResId()
                return r0
        }

        static java.lang.String getResPackage(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                java.lang.String r0 = r0.getResPackage()
                return r0
        }

        static int getType(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                int r0 = r0.getType()
                return r0
        }

        static android.net.Uri getUri(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                android.net.Uri r0 = r0.getUri()
                return r0
        }
    }

    static class Api30Impl {
        static android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(android.net.Uri r0) {
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r0)
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE = r0
            return
    }

    public IconCompat() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mType = r0
            r0 = 0
            r2.mData = r0
            r2.mParcelable = r0
            r1 = 0
            r2.mInt1 = r1
            r2.mInt2 = r1
            r2.mTintList = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            r2.mTintMode = r1
            r2.mTintModeStr = r0
            return
    }

    IconCompat(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mData = r0
            r2.mParcelable = r0
            r1 = 0
            r2.mInt1 = r1
            r2.mInt2 = r1
            r2.mTintList = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            r2.mTintMode = r1
            r2.mTintModeStr = r0
            r2.mType = r3
            return
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.graphics.drawable.Icon r0) {
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIconInner(r0)
            return r0
    }

    static android.graphics.Bitmap createLegacyIconFromAdaptiveIcon(android.graphics.Bitmap r9, boolean r10) {
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r0 = r0 * r1
            int r0 = (int) r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r0, r1)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 3
            r3.<init>(r4)
            float r4 = (float) r0
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r4
            r6 = 1063955115(0x3f6aaaab, float:0.9166667)
            float r6 = r6 * r5
            if (r10 == 0) goto L52
            r10 = 1009429163(0x3c2aaaab, float:0.010416667)
            float r10 = r10 * r4
            r7 = 0
            r3.setColor(r7)
            r7 = 1017817771(0x3caaaaab, float:0.020833334)
            float r4 = r4 * r7
            r7 = 1023410176(0x3d000000, float:0.03125)
            r8 = 0
            r3.setShadowLayer(r10, r8, r4, r7)
            r2.drawCircle(r5, r5, r6, r3)
            r4 = 503316480(0x1e000000, float:6.7762636E-21)
            r3.setShadowLayer(r10, r8, r8, r4)
            r2.drawCircle(r5, r5, r6, r3)
            r3.clearShadowLayer()
        L52:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r10)
            android.graphics.BitmapShader r10 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r10.<init>(r9, r4, r4)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r7 = r9.getWidth()
            int r7 = r7 - r0
            int r7 = -r7
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            int r9 = r9.getHeight()
            int r9 = r9 - r0
            int r9 = -r9
            float r9 = (float) r9
            float r9 = r9 / r8
            r4.setTranslate(r7, r9)
            r10.setLocalMatrix(r4)
            r3.setShader(r10)
            r2.drawCircle(r5, r5, r6, r3)
            r9 = 0
            r2.setBitmap(r9)
            return r1
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(android.net.Uri r0) {
            androidx.core.util.ObjectsCompat.requireNonNull(r0)
            java.lang.String r0 = r0.toString()
            androidx.core.graphics.drawable.IconCompat r0 = createWithAdaptiveBitmapContentUri(r0)
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(java.lang.String r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 6
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithBitmap(android.graphics.Bitmap r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 1
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(android.net.Uri r0) {
            androidx.core.util.ObjectsCompat.requireNonNull(r0)
            java.lang.String r0 = r0.toString()
            androidx.core.graphics.drawable.IconCompat r0 = createWithContentUri(r0)
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(java.lang.String r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 4
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.res.Resources r2, java.lang.String r3, int r4) {
            androidx.core.util.ObjectsCompat.requireNonNull(r3)
            if (r4 == 0) goto L23
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 2
            r0.<init>(r1)
            r0.mInt1 = r4
            if (r2 == 0) goto L1e
            java.lang.String r2 = r2.getResourceName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L16
            r0.mObj1 = r2     // Catch: android.content.res.Resources.NotFoundException -> L16
            goto L20
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Icon resource cannot be found"
            r2.<init>(r3)
            throw r2
        L1e:
            r0.mObj1 = r3
        L20:
            r0.mString1 = r3
            return r0
        L23:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Drawable resource ID must not be 0"
            r2.<init>(r3)
            throw r2
    }

    private static java.lang.String typeToString(int r0) {
            switch(r0) {
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UNKNOWN"
            return r0
        L6:
            java.lang.String r0 = "URI_MASKABLE"
            return r0
        L9:
            java.lang.String r0 = "BITMAP_MASKABLE"
            return r0
        Lc:
            java.lang.String r0 = "URI"
            return r0
        Lf:
            java.lang.String r0 = "DATA"
            return r0
        L12:
            java.lang.String r0 = "RESOURCE"
            return r0
        L15:
            java.lang.String r0 = "BITMAP"
            return r0
    }

    public android.graphics.Bitmap getBitmap() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L16
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L16
            java.lang.Object r0 = r3.mObj1
            boolean r1 = r0 instanceof android.graphics.Bitmap
            if (r1 == 0) goto L14
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L14:
            r0 = 0
            return r0
        L16:
            r1 = 1
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L1e:
            r2 = 5
            if (r0 != r2) goto L2a
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = createLegacyIconFromAdaptiveIcon(r0, r1)
            return r0
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getBitmap() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int getResId() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L12
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L12
            java.lang.Object r0 = r3.mObj1
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getResId(r0)
            return r0
        L12:
            r1 = 2
            if (r0 != r1) goto L18
            int r0 = r3.mInt1
            return r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResId() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getResPackage() {
            r4 = this;
            int r0 = r4.mType
            r1 = -1
            if (r0 != r1) goto L12
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L12
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getResPackage(r0)
            return r0
        L12:
            r2 = 2
            if (r0 != r2) goto L31
            java.lang.String r0 = r4.mString1
            if (r0 == 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L20
            goto L23
        L20:
            java.lang.String r0 = r4.mString1
            return r0
        L23:
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2, r1)
            r1 = 0
            r0 = r0[r1]
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResPackage() on "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int getType() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L11
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L11
            java.lang.Object r0 = r3.mObj1
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getType(r0)
        L11:
            return r0
    }

    public android.net.Uri getUri() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L12
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L12
            java.lang.Object r0 = r3.mObj1
            android.net.Uri r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getUri(r0)
            return r0
        L12:
            r1 = 4
            if (r0 == r1) goto L30
            r1 = 6
            if (r0 != r1) goto L19
            goto L30
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getUri() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L30:
            java.lang.Object r0 = r3.mObj1
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }

    public java.io.InputStream getUriInputStream(android.content.Context r5) {
            r4 = this;
            android.net.Uri r0 = r4.getUri()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            java.lang.String r3 = "IconCompat"
            if (r2 != 0) goto L40
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1b
            goto L40
        L1b:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L2a
            java.io.File r1 = new java.io.File     // Catch: java.io.FileNotFoundException -> L2a
            java.lang.Object r2 = r4.mObj1     // Catch: java.io.FileNotFoundException -> L2a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.FileNotFoundException -> L2a
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L2a
            r5.<init>(r1)     // Catch: java.io.FileNotFoundException -> L2a
            return r5
        L2a:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from path: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0, r5)
            goto L5e
        L40:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L49
            java.io.InputStream r5 = r5.openInputStream(r0)     // Catch: java.lang.Exception -> L49
            return r5
        L49:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from URI: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0, r5)
        L5e:
            r5 = 0
            return r5
    }

    public void onPostParceling() {
            r4 = this;
            java.lang.String r0 = r4.mTintModeStr
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.valueOf(r0)
            r4.mTintMode = r0
            int r0 = r4.mType
            r1 = 0
            switch(r0) {
                case -1: goto L4c;
                case 0: goto Le;
                case 1: goto L38;
                case 2: goto L14;
                case 3: goto Lf;
                case 4: goto L14;
                case 5: goto L38;
                case 6: goto L14;
                default: goto Le;
            }
        Le:
            goto L5b
        Lf:
            byte[] r0 = r4.mData
            r4.mObj1 = r0
            goto L5b
        L14:
            java.lang.String r0 = new java.lang.String
            byte[] r2 = r4.mData
            java.lang.String r3 = "UTF-16"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r0.<init>(r2, r3)
            r4.mObj1 = r0
            int r2 = r4.mType
            r3 = 2
            if (r2 != r3) goto L5b
            java.lang.String r2 = r4.mString1
            if (r2 != 0) goto L5b
            r2 = -1
            java.lang.String r3 = ":"
            java.lang.String[] r0 = r0.split(r3, r2)
            r0 = r0[r1]
            r4.mString1 = r0
            goto L5b
        L38:
            android.os.Parcelable r0 = r4.mParcelable
            if (r0 == 0) goto L3f
            r4.mObj1 = r0
            goto L5b
        L3f:
            byte[] r0 = r4.mData
            r4.mObj1 = r0
            r2 = 3
            r4.mType = r2
            r4.mInt1 = r1
            int r0 = r0.length
            r4.mInt2 = r0
            goto L5b
        L4c:
            android.os.Parcelable r0 = r4.mParcelable
            if (r0 == 0) goto L53
            r4.mObj1 = r0
            goto L5b
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L5b:
            return
    }

    public void onPreParceling(boolean r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.mTintMode
            java.lang.String r0 = r0.name()
            r3.mTintModeStr = r0
            int r0 = r3.mType
            java.lang.String r1 = "UTF-16"
            switch(r0) {
                case -1: goto L57;
                case 0: goto Lf;
                case 1: goto L37;
                case 2: goto L28;
                case 3: goto L21;
                case 4: goto L10;
                case 5: goto L37;
                case 6: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L68
        L10:
            java.lang.Object r4 = r3.mObj1
            java.lang.String r4 = r4.toString()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r1)
            byte[] r4 = r4.getBytes(r0)
            r3.mData = r4
            goto L68
        L21:
            java.lang.Object r4 = r3.mObj1
            byte[] r4 = (byte[]) r4
            r3.mData = r4
            goto L68
        L28:
            java.lang.Object r4 = r3.mObj1
            java.lang.String r4 = (java.lang.String) r4
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r1)
            byte[] r4 = r4.getBytes(r0)
            r3.mData = r4
            goto L68
        L37:
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.mObj1
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r2 = 90
            r4.compress(r1, r2, r0)
            byte[] r4 = r0.toByteArray()
            r3.mData = r4
            goto L68
        L50:
            java.lang.Object r4 = r3.mObj1
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3.mParcelable = r4
            goto L68
        L57:
            if (r4 != 0) goto L60
            java.lang.Object r4 = r3.mObj1
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3.mParcelable = r4
            goto L68
        L60:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't serialize Icon created with IconCompat#createFromIcon"
            r4.<init>(r0)
            throw r4
        L68:
            return
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Icon toIcon() {
            r1 = this;
            r0 = 0
            android.graphics.drawable.Icon r0 = r1.toIcon(r0)
            return r0
    }

    public android.graphics.drawable.Icon toIcon(android.content.Context r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.graphics.drawable.Icon r3 = androidx.core.graphics.drawable.IconCompat.Api23Impl.toIcon(r2, r3)
            return r3
        Lb:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method is only supported on API level 23+"
            r3.<init>(r0)
            throw r3
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.mType
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.mType
            java.lang.String r1 = typeToString(r1)
            r0.append(r1)
            int r1 = r4.mType
            switch(r1) {
                case 1: goto L6d;
                case 2: goto L46;
                case 3: goto L2d;
                case 4: goto L22;
                case 5: goto L6d;
                case 6: goto L22;
                default: goto L21;
            }
        L21:
            goto L8d
        L22:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.mObj1
            r0.append(r1)
            goto L8d
        L2d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.mInt1
            r0.append(r1)
            int r1 = r4.mInt2
            if (r1 == 0) goto L8d
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.mInt2
            r0.append(r1)
            goto L8d
        L46:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mString1
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.getResId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L8d
        L6d:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L8d:
            android.content.res.ColorStateList r1 = r4.mTintList
            if (r1 == 0) goto L9b
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.mTintList
            r0.append(r1)
        L9b:
            android.graphics.PorterDuff$Mode r1 = r4.mTintMode
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r1 == r2) goto Lab
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.mTintMode
            r0.append(r1)
        Lab:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
