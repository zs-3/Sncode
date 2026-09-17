package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzab {
    private com.google.android.gms.internal.measurement.zzaa zza;
    private com.google.android.gms.internal.measurement.zzaa zzb;
    private final java.util.List zzc;

    public zzab() {
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.measurement.zzaa r0 = new com.google.android.gms.internal.measurement.zzaa
            java.lang.String r1 = ""
            r2 = 0
            r4 = 0
            r0.<init>(r1, r2, r4)
            r5.zza = r0
            com.google.android.gms.internal.measurement.zzaa r0 = new com.google.android.gms.internal.measurement.zzaa
            r0.<init>(r1, r2, r4)
            r5.zzb = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.zzc = r0
            return
    }

    public zzab(com.google.android.gms.internal.measurement.zzaa r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.internal.measurement.zzaa r1 = r1.zzb()
            r0.zzb = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzc = r1
            return
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r4 = this;
            com.google.android.gms.internal.measurement.zzab r0 = new com.google.android.gms.internal.measurement.zzab
            com.google.android.gms.internal.measurement.zzaa r1 = r4.zza
            com.google.android.gms.internal.measurement.zzaa r1 = r1.zzb()
            r0.<init>(r1)
            java.util.List r1 = r4.zzc
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.zzaa r2 = (com.google.android.gms.internal.measurement.zzaa) r2
            java.util.List r3 = r0.zzc
            com.google.android.gms.internal.measurement.zzaa r2 = r2.zzb()
            r3.add(r2)
            goto L11
        L27:
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzaa zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzaa r0 = r1.zza
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzaa zzb() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzaa r0 = r1.zzb
            return r0
    }

    public final java.util.List zzc() {
            r1 = this;
            java.util.List r0 = r1.zzc
            return r0
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzaa r1) {
            r0 = this;
            r0.zza = r1
            com.google.android.gms.internal.measurement.zzaa r1 = r1.zzb()
            r0.zzb = r1
            java.util.List r1 = r0.zzc
            r1.clear()
            return
    }

    public final void zze(java.lang.String r6, long r7, java.util.Map r9) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r9.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.measurement.zzaa r3 = r5.zza
            java.lang.Object r3 = r3.zzc(r2)
            java.lang.Object r4 = r9.get(r2)
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzaa.zzd(r2, r3, r4)
            r0.put(r2, r3)
            goto Ld
        L2b:
            java.util.List r9 = r5.zzc
            com.google.android.gms.internal.measurement.zzaa r1 = new com.google.android.gms.internal.measurement.zzaa
            r1.<init>(r6, r7, r0)
            r9.add(r1)
            return
    }

    public final void zzf(com.google.android.gms.internal.measurement.zzaa r1) {
            r0 = this;
            r0.zzb = r1
            return
    }
}
