package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcnj implements com.google.android.gms.internal.ads.zzcnf {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcnj(com.google.android.gms.ads.internal.util.zzg r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(java.util.Map r2) {
            r1 = this;
            java.lang.String r0 = "content_vertical_opted_out"
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            com.google.android.gms.ads.internal.util.zzg r0 = r1.zza
            r0.zzA(r2)
            return
    }
}
