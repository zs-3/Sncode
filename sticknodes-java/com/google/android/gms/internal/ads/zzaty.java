package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaty extends com.google.android.gms.internal.ads.zzatw {
    public java.lang.String zza;
    public long zzb;
    public java.lang.String zzc;
    public java.lang.String zzd;
    public java.lang.String zze;

    public zzaty() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "E"
            r3.zza = r0
            r1 = -1
            r3.zzb = r1
            r3.zzc = r0
            r3.zzd = r0
            r3.zze = r0
            return
    }

    public zzaty(java.lang.String r6) {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "E"
            r5.zza = r0
            r1 = -1
            r5.zzb = r1
            r5.zzc = r0
            r5.zzd = r0
            r5.zze = r0
            java.util.HashMap r6 = com.google.android.gms.internal.ads.zzatw.zza(r6)
            if (r6 == 0) goto L83
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r6.get(r3)
            if (r4 != 0) goto L24
            r3 = r0
            goto L2a
        L24:
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
        L2a:
            r5.zza = r3
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r6.get(r3)
            if (r4 != 0) goto L38
            goto L42
        L38:
            java.lang.Object r1 = r6.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
        L42:
            r5.zzb = r1
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r6.get(r1)
            if (r2 != 0) goto L51
            r1 = r0
            goto L57
        L51:
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L57:
            r5.zzc = r1
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r6.get(r1)
            if (r2 != 0) goto L66
            r1 = r0
            goto L6c
        L66:
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L6c:
            r5.zzd = r1
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r6.get(r1)
            if (r2 != 0) goto L7a
            goto L81
        L7a:
            java.lang.Object r6 = r6.get(r1)
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L81:
            r5.zze = r0
        L83:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final java.util.HashMap zzb() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r4.zza
            r0.put(r1, r2)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r4.zze
            r0.put(r1, r2)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r4.zzd
            r0.put(r1, r2)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r4.zzc
            r0.put(r1, r2)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r2 = r4.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
            return r0
    }
}
