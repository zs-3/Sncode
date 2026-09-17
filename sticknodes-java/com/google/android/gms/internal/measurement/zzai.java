package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzai implements com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzal {
    protected final java.lang.String zzd;
    protected final java.util.Map zze;

    public zzai(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zze = r0
            r1.zzd = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzai
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.google.android.gms.internal.measurement.zzai r3 = (com.google.android.gms.internal.measurement.zzai) r3
            java.lang.String r0 = r2.zzd
            if (r0 == 0) goto L17
            java.lang.String r3 = r3.zzd
            boolean r3 = r0.equals(r3)
            return r3
        L17:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public abstract com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r1, java.util.List r2);

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r2, com.google.android.gms.internal.measurement.zzg r3, java.util.List r4) {
            r1 = this;
            java.lang.String r0 = "toString"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = r1.zzd
            com.google.android.gms.internal.measurement.zzat r3 = new com.google.android.gms.internal.measurement.zzat
            r3.<init>(r2)
            return r3
        L10:
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            r0.<init>(r2)
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzaj.zza(r1, r0, r3, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public com.google.android.gms.internal.measurement.zzap zzd() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final com.google.android.gms.internal.measurement.zzap zzf(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.zze
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto Lf
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            return r3
        Lf:
            com.google.android.gms.internal.measurement.zzap r3 = com.google.android.gms.internal.measurement.zzap.zzf
            return r3
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
            r2 = this;
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
            r1 = this;
            java.util.Map r0 = r1.zze
            java.util.Iterator r0 = com.google.android.gms.internal.measurement.zzaj.zzb(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(java.lang.String r2, com.google.android.gms.internal.measurement.zzap r3) {
            r1 = this;
            if (r3 != 0) goto L8
            java.util.Map r3 = r1.zze
            r3.remove(r2)
            return
        L8:
            java.util.Map r0 = r1.zze
            r0.put(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.zze
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
