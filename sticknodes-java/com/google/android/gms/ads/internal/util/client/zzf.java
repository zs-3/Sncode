package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzf {
    public static final android.os.Handler zza = null;
    private static final java.lang.String zzb = null;
    private static final java.lang.String zzc = null;
    private static final java.lang.String zzd = null;
    private static final java.lang.String zze = null;
    private static final java.lang.String zzf = null;
    private static final java.lang.String zzg = null;
    private float zzh;

    static {
            com.google.android.gms.internal.ads.zzfun r0 = new com.google.android.gms.internal.ads.zzfun
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.ads.internal.util.client.zzf.zza = r0
            java.lang.Class<com.google.android.gms.ads.AdView> r0 = com.google.android.gms.ads.AdView.class
            java.lang.String r0 = r0.getName()
            com.google.android.gms.ads.internal.util.client.zzf.zzb = r0
            java.lang.Class<com.google.android.gms.ads.interstitial.InterstitialAd> r0 = com.google.android.gms.ads.interstitial.InterstitialAd.class
            java.lang.String r0 = r0.getName()
            com.google.android.gms.ads.internal.util.client.zzf.zzc = r0
            java.lang.Class<com.google.android.gms.ads.admanager.AdManagerAdView> r0 = com.google.android.gms.ads.admanager.AdManagerAdView.class
            java.lang.String r0 = r0.getName()
            com.google.android.gms.ads.internal.util.client.zzf.zzd = r0
            java.lang.Class<com.google.android.gms.ads.admanager.AdManagerInterstitialAd> r0 = com.google.android.gms.ads.admanager.AdManagerInterstitialAd.class
            java.lang.String r0 = r0.getName()
            com.google.android.gms.ads.internal.util.client.zzf.zze = r0
            java.lang.Class<com.google.android.gms.ads.search.SearchAdView> r0 = com.google.android.gms.ads.search.SearchAdView.class
            java.lang.String r0 = r0.getName()
            com.google.android.gms.ads.internal.util.client.zzf.zzf = r0
            java.lang.Class<com.google.android.gms.ads.AdLoader> r0 = com.google.android.gms.ads.AdLoader.class
            java.lang.String r0 = r0.getName()
            com.google.android.gms.ads.internal.util.client.zzf.zzg = r0
            return
    }

    public zzf() {
            r1 = this;
            r1.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.zzh = r0
            return
    }

    private static java.lang.String zzA(java.lang.String r9, java.lang.String r10) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 2
            r3 = 0
            if (r1 >= r2) goto L2c
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r10)     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            byte[] r4 = r9.getBytes()     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            r2.update(r4)     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            java.lang.String r5 = "%032X"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            java.math.BigInteger r8 = new java.math.BigInteger     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            byte[] r2 = r2.digest()     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            r8.<init>(r6, r2)     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            r7[r0] = r8     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            java.lang.String r9 = java.lang.String.format(r4, r5, r7)     // Catch: java.lang.ArithmeticException -> L28 java.security.NoSuchAlgorithmException -> L29
            return r9
        L28:
            return r3
        L29:
            int r1 = r1 + 1
            goto L2
        L2c:
            return r3
    }

    private final org.json.JSONArray zzB(java.util.Collection r3) throws org.json.JSONException {
            r2 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r3.next()
            r2.zzC(r0, r1)
            goto L9
        L17:
            return r0
    }

    private final void zzC(org.json.JSONArray r2, java.lang.Object r3) throws org.json.JSONException {
            r1 = this;
            boolean r0 = r3 instanceof android.os.Bundle
            if (r0 == 0) goto Le
            android.os.Bundle r3 = (android.os.Bundle) r3
            org.json.JSONObject r3 = r1.zzi(r3)
            r2.put(r3)
            return
        Le:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L1c
            java.util.Map r3 = (java.util.Map) r3
            org.json.JSONObject r3 = r1.zzj(r3)
            r2.put(r3)
            return
        L1c:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L2a
            java.util.Collection r3 = (java.util.Collection) r3
            org.json.JSONArray r3 = r1.zzB(r3)
            r2.put(r3)
            return
        L2a:
            boolean r0 = r3 instanceof java.lang.Object[]
            if (r0 == 0) goto L38
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            org.json.JSONArray r3 = r1.zzh(r3)
            r2.put(r3)
            return
        L38:
            r2.put(r3)
            return
    }

    private final void zzD(org.json.JSONObject r6, java.lang.String r7, java.lang.Object r8) throws org.json.JSONException {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzn
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L16
            java.lang.String r7 = java.lang.String.valueOf(r7)
        L16:
            boolean r0 = r8 instanceof android.os.Bundle
            if (r0 == 0) goto L24
            android.os.Bundle r8 = (android.os.Bundle) r8
            org.json.JSONObject r8 = r5.zzi(r8)
            r6.put(r7, r8)
            return
        L24:
            boolean r0 = r8 instanceof java.util.Map
            if (r0 == 0) goto L32
            java.util.Map r8 = (java.util.Map) r8
            org.json.JSONObject r8 = r5.zzj(r8)
            r6.put(r7, r8)
            return
        L32:
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L44
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.util.Collection r8 = (java.util.Collection) r8
            org.json.JSONArray r8 = r5.zzB(r8)
            r6.put(r7, r8)
            return
        L44:
            boolean r0 = r8 instanceof java.lang.Object[]
            if (r0 == 0) goto L56
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.util.List r8 = java.util.Arrays.asList(r8)
            org.json.JSONArray r8 = r5.zzB(r8)
            r6.put(r7, r8)
            return
        L56:
            boolean r0 = r8 instanceof int[]
            r1 = 0
            if (r0 == 0) goto L7b
            int[] r8 = (int[]) r8
            if (r8 != 0) goto L62
            java.lang.Integer[] r8 = new java.lang.Integer[r1]
            goto L73
        L62:
            int r0 = r8.length
            java.lang.Integer[] r2 = new java.lang.Integer[r0]
        L65:
            if (r1 >= r0) goto L72
            r3 = r8[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L65
        L72:
            r8 = r2
        L73:
            org.json.JSONArray r8 = r5.zzh(r8)
            r6.put(r7, r8)
            return
        L7b:
            boolean r0 = r8 instanceof double[]
            if (r0 == 0) goto L9f
            double[] r8 = (double[]) r8
            if (r8 != 0) goto L86
            java.lang.Double[] r8 = new java.lang.Double[r1]
            goto L97
        L86:
            int r0 = r8.length
            java.lang.Double[] r2 = new java.lang.Double[r0]
        L89:
            if (r1 >= r0) goto L96
            r3 = r8[r1]
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L89
        L96:
            r8 = r2
        L97:
            org.json.JSONArray r8 = r5.zzh(r8)
            r6.put(r7, r8)
            return
        L9f:
            boolean r0 = r8 instanceof long[]
            if (r0 == 0) goto Lc3
            long[] r8 = (long[]) r8
            if (r8 != 0) goto Laa
            java.lang.Long[] r8 = new java.lang.Long[r1]
            goto Lbb
        Laa:
            int r0 = r8.length
            java.lang.Long[] r2 = new java.lang.Long[r0]
        Lad:
            if (r1 >= r0) goto Lba
            r3 = r8[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lad
        Lba:
            r8 = r2
        Lbb:
            org.json.JSONArray r8 = r5.zzh(r8)
            r6.put(r7, r8)
            return
        Lc3:
            boolean r0 = r8 instanceof boolean[]
            if (r0 == 0) goto Le7
            boolean[] r8 = (boolean[]) r8
            if (r8 != 0) goto Lce
            java.lang.Boolean[] r8 = new java.lang.Boolean[r1]
            goto Ldf
        Lce:
            int r0 = r8.length
            java.lang.Boolean[] r2 = new java.lang.Boolean[r0]
        Ld1:
            if (r1 >= r0) goto Lde
            boolean r3 = r8[r1]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Ld1
        Lde:
            r8 = r2
        Ldf:
            org.json.JSONArray r8 = r5.zzh(r8)
            r6.put(r7, r8)
            return
        Le7:
            r6.put(r7, r8)
            return
    }

    private static final void zzE(android.view.ViewGroup r3, com.google.android.gms.ads.internal.client.zzs r4, java.lang.String r5, int r6, int r7) {
            int r0 = r3.getChildCount()
            if (r0 == 0) goto L7
            return
        L7:
            android.content.Context r0 = r3.getContext()
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            r2 = 17
            r1.setGravity(r2)
            r1.setText(r5)
            r1.setTextColor(r6)
            r1.setBackgroundColor(r7)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r5.<init>(r0)
            r5.setBackgroundColor(r6)
            r6 = 3
            int r6 = zzy(r0, r6)
            int r7 = r4.zzf
            int r7 = r7 - r6
            int r0 = r4.zzc
            int r0 = r0 - r6
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r7, r0, r2)
            r5.addView(r1, r6)
            int r6 = r4.zzf
            int r4 = r4.zzc
            r3.addView(r5, r6, r4)
            return
    }

    public static int zza(android.content.Context r1, int r2) {
            if (r1 != 0) goto L3
            goto L3c
        L3:
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r1 = r1.getApplicationContext()
        Ld:
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L3c
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            if (r0 == 0) goto L3c
            android.content.res.Configuration r1 = r1.getConfiguration()
            if (r1 == 0) goto L3c
            int r1 = r1.orientation
            if (r2 != 0) goto L24
            r2 = r1
        L24:
            if (r2 != r1) goto L31
            int r1 = r0.heightPixels
            float r1 = (float) r1
            float r2 = r0.density
            float r1 = r1 / r2
            int r1 = java.lang.Math.round(r1)
            return r1
        L31:
            int r1 = r0.widthPixels
            float r1 = (float) r1
            float r2 = r0.density
            float r1 = r1 / r2
            int r1 = java.lang.Math.round(r1)
            return r1
        L3c:
            r1 = -1
            return r1
    }

    public static android.app.ActivityManager.MemoryInfo zzc(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "activity"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            if (r2 != 0) goto Lf
            return r0
        Lf:
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            r2.getMemoryInfo(r0)     // Catch: java.lang.NullPointerException -> L18
            goto L1d
        L18:
            java.lang.String r2 = "Error retrieving the memory information."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
        L1d:
            return r0
    }

    public static com.google.android.gms.ads.AdSize zzd(android.content.Context r0, int r1, int r2, int r3) {
            int r0 = zza(r0, r3)
            r2 = -1
            if (r0 != r2) goto La
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.AdSize.INVALID
            return r0
        La:
            r2 = 90
            float r0 = (float) r0
            r3 = 1041865114(0x3e19999a, float:0.15)
            float r0 = r0 * r3
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.min(r2, r0)
            r2 = 655(0x28f, float:9.18E-43)
            if (r1 <= r2) goto L2b
            float r2 = (float) r1
            r3 = 1144389632(0x44360000, float:728.0)
            float r2 = r2 / r3
            r3 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            goto L56
        L2b:
            r2 = 632(0x278, float:8.86E-43)
            if (r1 <= r2) goto L32
            r2 = 81
            goto L56
        L32:
            r2 = 526(0x20e, float:7.37E-43)
            if (r1 <= r2) goto L43
            float r2 = (float) r1
            r3 = 1139408896(0x43ea0000, float:468.0)
            float r2 = r2 / r3
            r3 = 1114636288(0x42700000, float:60.0)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            goto L56
        L43:
            r2 = 432(0x1b0, float:6.05E-43)
            if (r1 <= r2) goto L4a
            r2 = 68
            goto L56
        L4a:
            float r2 = (float) r1
            r3 = 1134559232(0x43a00000, float:320.0)
            float r2 = r2 / r3
            r3 = 1112014848(0x42480000, float:50.0)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
        L56:
            int r0 = java.lang.Math.min(r2, r0)
            r2 = 50
            int r0 = java.lang.Math.max(r0, r2)
            com.google.android.gms.ads.AdSize r2 = new com.google.android.gms.ads.AdSize
            r2.<init>(r1, r0)
            return r2
    }

    public static java.lang.String zze() {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            long r1 = r0.getLeastSignificantBits()
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            byte[] r1 = r1.toByteArray()
            long r2 = r0.getMostSignificantBits()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r2)
            byte[] r0 = r0.toByteArray()
            java.math.BigInteger r2 = new java.math.BigInteger
            r3 = 1
            r2.<init>(r3, r1)
            java.lang.String r2 = r2.toString()
            r4 = 0
            r5 = 0
        L28:
            r6 = 2
            if (r5 >= r6) goto L4e
            java.lang.String r6 = "MD5"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            r6.update(r1)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            r6.update(r0)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            r7 = 8
            byte[] r8 = new byte[r7]     // Catch: java.security.NoSuchAlgorithmException -> L4b
            byte[] r6 = r6.digest()     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.lang.System.arraycopy(r6, r4, r8, r4, r7)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.math.BigInteger r6 = new java.math.BigInteger     // Catch: java.security.NoSuchAlgorithmException -> L4b
            r6.<init>(r3, r8)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.lang.String r2 = r6.toString()     // Catch: java.security.NoSuchAlgorithmException -> L4b
        L4b:
            int r5 = r5 + 1
            goto L28
        L4e:
            return r2
    }

    public static java.lang.String zzf(java.lang.String r1) {
            java.lang.String r0 = "MD5"
            java.lang.String r1 = zzA(r1, r0)
            return r1
    }

    public static java.lang.String zzg(java.lang.String r1) {
            java.lang.String r0 = "SHA-256"
            java.lang.String r1 = zzA(r1, r0)
            return r1
    }

    public static boolean zzp(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbfa.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r1.startsWith(r0)
            return r1
    }

    public static final int zzq(android.util.DisplayMetrics r1, int r2) {
            float r2 = (float) r2
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    public static final java.lang.String zzr(java.lang.StackTraceElement[] r5, java.lang.String r6) {
            r0 = 0
        L1:
            int r1 = r0 + 1
            int r2 = r5.length
            r3 = 0
            if (r1 >= r2) goto L52
            r0 = r5[r0]
            java.lang.String r2 = r0.getClassName()
            java.lang.String r0 = r0.getMethodName()
            java.lang.String r4 = "loadAd"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L50
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zzb
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L49
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zzc
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L49
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zzd
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L49
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zze
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L49
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zzf
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L49
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zzg
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L50
        L49:
            r5 = r5[r1]
            java.lang.String r5 = r5.getClassName()
            goto L53
        L50:
            r0 = r1
            goto L1
        L52:
            r5 = r3
        L53:
            if (r6 == 0) goto L91
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = "."
            r0.<init>(r6, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r4 = r0.hasMoreElements()
            if (r4 == 0) goto L88
            java.lang.String r6 = r0.nextToken()
            r2.append(r6)
            r6 = 2
        L6f:
            if (r6 <= 0) goto L84
            boolean r4 = r0.hasMoreElements()
            if (r4 == 0) goto L84
            r2.append(r1)
            java.lang.String r4 = r0.nextToken()
            r2.append(r4)
            int r6 = r6 + (-1)
            goto L6f
        L84:
            java.lang.String r6 = r2.toString()
        L88:
            if (r5 == 0) goto L91
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L91
            return r5
        L91:
            return r3
    }

    public static final boolean zzs() {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzla
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            java.lang.String r3 = "generic"
            r4 = 1
            r5 = 31
            if (r1 < r5) goto L3a
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L38
            java.lang.String r3 = "emulator"
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L38
            if (r0 == 0) goto L40
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "ranchu"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L37
            goto L40
        L37:
            return r4
        L38:
            r2 = 1
            goto L40
        L3a:
            java.lang.String r0 = android.os.Build.DEVICE
            boolean r2 = r0.startsWith(r3)
        L40:
            return r2
    }

    public static final boolean zzt(android.content.Context r1, int r2) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            int r1 = r0.isGooglePlayServicesAvailable(r1, r2)
            if (r1 != 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static final boolean zzu(android.content.Context r2) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r0.isGooglePlayServicesAvailable(r2, r1)
            if (r2 == 0) goto L13
            r0 = 2
            if (r2 != r0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    public static final boolean zzv() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static final int zzw(android.util.DisplayMetrics r0, int r1) {
            float r1 = (float) r1
            float r0 = r0.density
            float r1 = r1 / r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    public static final void zzx(android.content.Context r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4, boolean r5, com.google.android.gms.ads.internal.util.client.zze r6) {
            android.content.Context r3 = r1.getApplicationContext()
            if (r3 != 0) goto L7
            r3 = r1
        L7:
            java.lang.String r5 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "os"
            r4.putString(r0, r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "api"
            r4.putString(r0, r5)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r5 = "appid"
            r4.putString(r5, r3)
            if (r2 != 0) goto L3d
            com.google.android.gms.common.GoogleApiAvailabilityLight r2 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            int r1 = r2.getApkVersion(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".243220000"
            r2.append(r1)
            java.lang.String r2 = r2.toString()
        L3d:
            java.lang.String r1 = "js"
            r4.putString(r1, r2)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r2 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r2)
            java.lang.String r2 = "//pagead2.googlesyndication.com/pagead/gen_204"
            android.net.Uri$Builder r1 = r1.path(r2)
            java.lang.String r2 = "id"
            java.lang.String r3 = "gmob-apps"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
            java.util.Set r2 = r4.keySet()
            java.util.Iterator r2 = r2.iterator()
        L63:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = r4.getString(r3)
            r1.appendQueryParameter(r3, r5)
            goto L63
        L77:
            java.lang.String r1 = r1.toString()
            r6.zza(r1)
            return
    }

    public static final int zzy(android.content.Context r0, int r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = zzq(r0, r1)
            return r0
    }

    public static final java.lang.String zzz(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()
            if (r1 != 0) goto L8
            r1 = 0
            goto Le
        L8:
            java.lang.String r0 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r0)
        Le:
            if (r1 == 0) goto L16
            boolean r0 = zzs()
            if (r0 == 0) goto L18
        L16:
            java.lang.String r1 = "emulator"
        L18:
            java.lang.String r0 = "MD5"
            java.lang.String r1 = zzA(r1, r0)
            return r1
    }

    public final int zzb(android.content.Context r3, int r4) {
            r2 = this;
            float r0 = r2.zzh
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L30
            monitor-enter(r2)
            float r0 = r2.zzh     // Catch: java.lang.Throwable -> L2d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2b
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L2d
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            return r3
        L1b:
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Throwable -> L2d
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r3.getMetrics(r0)     // Catch: java.lang.Throwable -> L2d
            float r3 = r0.density     // Catch: java.lang.Throwable -> L2d
            r2.zzh = r3     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            goto L30
        L2d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r3
        L30:
            float r3 = (float) r4
            float r4 = r2.zzh
            float r3 = r3 / r4
            int r3 = java.lang.Math.round(r3)
            return r3
    }

    final org.json.JSONArray zzh(java.lang.Object[] r5) throws org.json.JSONException {
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r5[r2]
            r4.zzC(r0, r3)
            int r2 = r2 + 1
            goto L7
        L11:
            return r0
    }

    public final org.json.JSONObject zzi(android.os.Bundle r5) throws org.json.JSONException {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            r4.zzD(r0, r2, r3)
            goto Ld
        L21:
            return r0
    }

    public final org.json.JSONObject zzj(java.util.Map r5) throws org.json.JSONException {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.ClassCastException -> L22
            r0.<init>()     // Catch: java.lang.ClassCastException -> L22
            java.util.Set r1 = r5.keySet()     // Catch: java.lang.ClassCastException -> L22
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.ClassCastException -> L22
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.ClassCastException -> L22
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.ClassCastException -> L22
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.ClassCastException -> L22
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.ClassCastException -> L22
            r4.zzD(r0, r2, r3)     // Catch: java.lang.ClassCastException -> L22
            goto Ld
        L21:
            return r0
        L22:
            r5 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Could not convert map to JSON: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
    }

    public final org.json.JSONObject zzk(android.os.Bundle r2, org.json.JSONObject r3) {
            r1 = this;
            r3 = 0
            if (r2 == 0) goto Le
            org.json.JSONObject r3 = r1.zzi(r2)     // Catch: org.json.JSONException -> L8
            goto Le
        L8:
            r2 = move-exception
            java.lang.String r0 = "Error converting Bundle to JSON"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
        Le:
            return r3
    }

    public final void zzl(org.json.JSONObject r5, org.json.JSONObject r6) throws org.json.JSONException {
            r4 = this;
            java.util.Iterator r0 = r6.keys()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            java.lang.Object r1 = r5.get(r1)     // Catch: org.json.JSONException -> L30
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            boolean r3 = r3.isInstance(r1)
            if (r3 == 0) goto L4
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L4
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r4.zzl(r1, r2)
            goto L4
        L30:
            r5.put(r1, r2)
            goto L4
        L34:
            return
    }

    public final void zzm(android.view.ViewGroup r2, com.google.android.gms.ads.internal.client.zzs r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            if (r5 == 0) goto L5
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
        L5:
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            zzE(r2, r3, r4, r5, r0)
            return
    }

    public final void zzn(android.view.ViewGroup r3, com.google.android.gms.ads.internal.client.zzs r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r5 = "Ads by Google"
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = -1
            zzE(r3, r4, r5, r0, r1)
            return
    }

    public final void zzo(android.content.Context r7, java.lang.String r8, java.lang.String r9, android.os.Bundle r10, boolean r11) {
            r6 = this;
            com.google.android.gms.ads.internal.util.client.zzc r5 = new com.google.android.gms.ads.internal.util.client.zzc
            r5.<init>(r6)
            java.lang.String r2 = "gmob-apps"
            r4 = 1
            r0 = r7
            r1 = r8
            r3 = r10
            zzx(r0, r1, r2, r3, r4, r5)
            return
    }
}
