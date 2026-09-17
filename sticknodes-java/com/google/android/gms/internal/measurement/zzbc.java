package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzbc extends com.google.android.gms.internal.measurement.zzaw {
    protected zzbc() {
            r2 = this;
            r2.<init>()
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzb
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzV
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzY
            r0.add(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String r6, com.google.android.gms.internal.measurement.zzg r7, java.util.List r8) {
            r5 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.zza
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzh.zze(r6)
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L6b
            r4 = 47
            if (r0 == r4) goto L45
            r4 = 50
            if (r0 == r4) goto L1c
            com.google.android.gms.internal.measurement.zzap r6 = super.zzb(r6)
            return r6
        L1c:
            com.google.android.gms.internal.measurement.zzbl r6 = com.google.android.gms.internal.measurement.zzbl.zzY
            java.lang.String r6 = r6.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r6, r1, r8)
            java.lang.Object r6 = r8.get(r2)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r6 = r7.zzb(r6)
            java.lang.Boolean r0 = r6.zzg()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            return r6
        L3a:
            java.lang.Object r6 = r8.get(r3)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r6 = r7.zzb(r6)
            return r6
        L45:
            com.google.android.gms.internal.measurement.zzbl r6 = com.google.android.gms.internal.measurement.zzbl.zzV
            java.lang.String r6 = r6.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r6, r3, r8)
            java.lang.Object r6 = r8.get(r2)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r6 = r7.zzb(r6)
            com.google.android.gms.internal.measurement.zzaf r7 = new com.google.android.gms.internal.measurement.zzaf
            java.lang.Boolean r6 = r6.zzg()
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7.<init>(r6)
            return r7
        L6b:
            com.google.android.gms.internal.measurement.zzbl r6 = com.google.android.gms.internal.measurement.zzbl.zzb
            java.lang.String r6 = r6.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r6, r1, r8)
            java.lang.Object r6 = r8.get(r2)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r6 = r7.zzb(r6)
            java.lang.Boolean r0 = r6.zzg()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L89
            return r6
        L89:
            java.lang.Object r6 = r8.get(r3)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r6 = r7.zzb(r6)
            return r6
    }
}
