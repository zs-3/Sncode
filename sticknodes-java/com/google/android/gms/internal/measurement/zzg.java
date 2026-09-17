package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzg {
    public final com.google.android.gms.internal.measurement.zzg zza;
    final com.google.android.gms.internal.measurement.zzax zzb;
    final java.util.Map zzc;
    final java.util.Map zzd;

    public zzg(com.google.android.gms.internal.measurement.zzg r2, com.google.android.gms.internal.measurement.zzax r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzd = r0
            r1.zza = r2
            r1.zzb = r3
            return
    }

    public final com.google.android.gms.internal.measurement.zzg zza() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzg r0 = new com.google.android.gms.internal.measurement.zzg
            com.google.android.gms.internal.measurement.zzax r1 = r2.zzb
            r0.<init>(r2, r1)
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzap zzb(com.google.android.gms.internal.measurement.zzap r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzax r0 = r1.zzb
            com.google.android.gms.internal.measurement.zzap r2 = r0.zza(r1, r2)
            return r2
    }

    public final com.google.android.gms.internal.measurement.zzap zzc(com.google.android.gms.internal.measurement.zzae r4) {
            r3 = this;
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            java.util.Iterator r1 = r4.zzk()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r0 = r1.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.gms.internal.measurement.zzax r2 = r3.zzb
            com.google.android.gms.internal.measurement.zzap r0 = r4.zze(r0)
            com.google.android.gms.internal.measurement.zzap r0 = r2.zza(r3, r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.zzag
            if (r2 == 0) goto L6
        L24:
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzap zzd(java.lang.String r4) {
            r3 = this;
            java.util.Map r0 = r3.zzc
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto Lf
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4
            return r4
        Lf:
            com.google.android.gms.internal.measurement.zzg r0 = r3.zza
            if (r0 == 0) goto L18
            com.google.android.gms.internal.measurement.zzap r4 = r0.zzd(r4)
            return r4
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "%s is not defined"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public final void zze(java.lang.String r2, com.google.android.gms.internal.measurement.zzap r3) {
            r1 = this;
            java.util.Map r0 = r1.zzd
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L9
            return
        L9:
            if (r3 != 0) goto L11
            java.util.Map r3 = r1.zzc
            r3.remove(r2)
            return
        L11:
            java.util.Map r0 = r1.zzc
            r0.put(r2, r3)
            return
    }

    public final void zzf(java.lang.String r2, com.google.android.gms.internal.measurement.zzap r3) {
            r1 = this;
            r1.zze(r2, r3)
            java.util.Map r3 = r1.zzd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.put(r2, r0)
            return
    }

    public final void zzg(java.lang.String r4, com.google.android.gms.internal.measurement.zzap r5) {
            r3 = this;
            java.util.Map r0 = r3.zzc
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto L17
            com.google.android.gms.internal.measurement.zzg r1 = r3.zza
            if (r1 == 0) goto L17
            boolean r2 = r1.zzh(r4)
            if (r2 != 0) goto L13
            goto L17
        L13:
            r1.zzg(r4, r5)
            return
        L17:
            java.util.Map r1 = r3.zzd
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L20
            return
        L20:
            if (r5 != 0) goto L26
            r0.remove(r4)
            return
        L26:
            r0.put(r4, r5)
            return
    }

    public final boolean zzh(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.zzc
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto La
            r2 = 1
            return r2
        La:
            com.google.android.gms.internal.measurement.zzg r0 = r1.zza
            if (r0 == 0) goto L13
            boolean r2 = r0.zzh(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }
}
