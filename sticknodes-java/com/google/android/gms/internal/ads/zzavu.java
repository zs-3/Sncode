package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzavu extends com.google.android.gms.internal.ads.zzatw {
    public long zza;
    public long zzb;

    public zzavu() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.zza = r0
            r2.zzb = r0
            return
    }

    public zzavu(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.zza = r0
            r2.zzb = r0
            java.util.HashMap r3 = com.google.android.gms.internal.ads.zzatw.zza(r3)
            if (r3 == 0) goto L31
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r3.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.zza = r0
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            r2.zzb = r0
        L31:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final java.util.HashMap zzb() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r2 = r4.zza
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r2 = r4.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
            return r0
    }
}
