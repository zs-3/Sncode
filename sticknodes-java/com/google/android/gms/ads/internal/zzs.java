package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzs {
    private final android.content.Context zza;
    private final java.lang.String zzb;
    private final java.util.Map zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private final java.lang.String zzf;

    public zzs(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = r3.getApplicationContext()
            r2.zza = r0
            r2.zzb = r4
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            r2.zzc = r4
            java.lang.String r4 = r3.getPackageName()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.String r3 = r3.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            r0.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            r0.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.String r1 = "-"
            r0.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            r0.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.String r3 = r0.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            goto L4a
        L3a:
            r3 = move-exception
            java.lang.String r0 = "Unable to get package version name for reporting"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "-missing"
            java.lang.String r3 = r3.concat(r4)
        L4a:
            r2.zzf = r3
            return
    }

    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    public final java.util.Map zze() {
            r1 = this;
            java.util.Map r0 = r1.zzc
            return r0
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm r6, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r7) {
            r5 = this;
            com.google.android.gms.ads.internal.client.zzfy r0 = r6.zzj
            java.lang.String r0 = r0.zza
            r5.zzd = r0
            android.os.Bundle r6 = r6.zzm
            if (r6 == 0) goto L15
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r0 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r0 = r0.getName()
            android.os.Bundle r6 = r6.getBundle(r0)
            goto L16
        L15:
            r6 = 0
        L16:
            if (r6 != 0) goto L1a
            goto La1
        L1a:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbed.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.equals(r2)
            if (r3 == 0) goto L43
            java.lang.String r2 = r6.getString(r2)
            r5.zze = r2
            goto L2a
        L43:
            java.lang.String r3 = "csa_"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L2a
            java.util.Map r3 = r5.zzc
            r4 = 4
            java.lang.String r4 = r2.substring(r4)
            java.lang.String r2 = r6.getString(r2)
            r3.put(r4, r2)
            goto L2a
        L5a:
            java.util.Map r6 = r5.zzc
            java.lang.String r7 = r7.afmaVersion
            java.lang.String r0 = "SDKVersion"
            r6.put(r0, r7)
            com.google.android.gms.internal.ads.zzbeb r6 = com.google.android.gms.internal.ads.zzbed.zza
            java.lang.Object r6 = r6.zze()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto La1
            android.content.Context r6 = r5.zza
            com.google.android.gms.internal.ads.zzbeb r7 = com.google.android.gms.internal.ads.zzbed.zzb
            java.lang.Object r7 = r7.zze()
            java.lang.String r7 = (java.lang.String) r7
            android.os.Bundle r6 = com.google.android.gms.ads.internal.util.zzad.zzb(r6, r7)
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
        L87:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r1 = r5.zzc
            java.lang.Object r2 = r6.get(r0)
            java.lang.String r2 = r2.toString()
            r1.put(r0, r2)
            goto L87
        La1:
            return
    }
}
