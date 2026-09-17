package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaws extends com.google.android.gms.internal.ads.zzatw {
    public java.lang.Long zza;
    public java.lang.Long zzb;
    public java.lang.Long zzc;
    public java.lang.Long zzd;
    public java.lang.Long zze;

    public zzaws() {
            r0 = this;
            r0.<init>()
            return
    }

    public zzaws(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r2 = com.google.android.gms.internal.ads.zzatw.zza(r2)
            if (r2 == 0) goto L4a
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.zza = r0
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.zzb = r0
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.zzc = r0
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.zzd = r0
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r2.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            r1.zze = r2
        L4a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final java.util.HashMap zzb() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r2 = r3.zza
            r0.put(r1, r2)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r2 = r3.zzb
            r0.put(r1, r2)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r2 = r3.zzc
            r0.put(r1, r2)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r2 = r3.zzd
            r0.put(r1, r2)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r2 = r3.zze
            r0.put(r1, r2)
            return r0
    }
}
