package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdwl {
    private final android.content.Context zza;
    private final android.content.pm.ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private java.lang.String zze;

    public zzdwl(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            r1.zza = r2
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            r1.zzb = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziK
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.zzc = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziL
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.zzd = r2
            return
    }

    public final org.json.JSONObject zza() throws org.json.JSONException {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "name"
            android.content.Context r2 = r5.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            android.content.pm.ApplicationInfo r3 = r5.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            com.google.android.gms.internal.ads.zzfun r4 = com.google.android.gms.ads.internal.util.zzt.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            java.lang.CharSequence r2 = r2.getApplicationLabel(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            r0.put(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
        L1a:
            android.content.pm.ApplicationInfo r1 = r5.zzb
            java.lang.String r1 = r1.packageName
            java.lang.String r2 = "packageName"
            r0.put(r2, r1)
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r1 = r5.zza
            r2 = 0
            java.lang.String r1 = com.google.android.gms.ads.internal.util.zzt.zzp(r1)     // Catch: android.os.RemoteException -> L2e
            goto L2f
        L2e:
            r1 = r2
        L2f:
            java.lang.String r3 = "adMobAppId"
            r0.put(r3, r1)
            java.lang.String r1 = r5.zze
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L87
            android.content.Context r1 = r5.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r5.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            androidx.core.util.Pair r1 = r1.getApplicationLabelAndIcon(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            S r1 = r1.second     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r2 = r1
            goto L51
        L50:
        L51:
            if (r2 != 0) goto L56
            java.lang.String r1 = ""
            goto L85
        L56:
            int r1 = r5.zzc
            int r3 = r5.zzd
            r4 = 0
            r2.setBounds(r4, r4, r1, r3)
            int r1 = r5.zzc
            int r3 = r5.zzd
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r3, r4)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r1)
            r2.draw(r3)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG
            r4 = 100
            r1.compress(r3, r4, r2)
            byte[] r1 = r2.toByteArray()
            r2 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
        L85:
            r5.zze = r1
        L87:
            java.lang.String r1 = r5.zze
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto La4
            java.lang.String r1 = r5.zze
            java.lang.String r2 = "icon"
            r0.put(r2, r1)
            int r1 = r5.zzc
            java.lang.String r2 = "iconWidthPx"
            r0.put(r2, r1)
            int r1 = r5.zzd
            java.lang.String r2 = "iconHeightPx"
            r0.put(r2, r1)
        La4:
            return r0
    }
}
