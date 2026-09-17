package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzhia {
    public zzhia() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzhia zzb(java.lang.Class r2) {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "Dalvik"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzhhv r0 = new com.google.android.gms.internal.ads.zzhhv
            java.lang.String r2 = r2.getSimpleName()
            r0.<init>(r2)
            return r0
        L18:
            com.google.android.gms.internal.ads.zzhhx r0 = new com.google.android.gms.internal.ads.zzhhx
            java.lang.String r2 = r2.getSimpleName()
            r0.<init>(r2)
            return r0
    }

    public abstract void zza(java.lang.String r1);
}
