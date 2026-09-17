package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzs extends com.google.android.gms.internal.measurement.zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzt zzc;

    public zzs(com.google.android.gms.internal.measurement.zzt r1, boolean r2, boolean r3) {
            r0 = this;
            r0.zzc = r1
            java.lang.String r1 = "log"
            r0.<init>(r1)
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r12, java.util.List r13) {
            r11 = this;
            java.lang.String r0 = "log"
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zzi(r0, r1, r13)
            int r0 = r13.size()
            r2 = 0
            if (r0 != r1) goto L30
            com.google.android.gms.internal.measurement.zzt r0 = r11.zzc
            com.google.android.gms.internal.measurement.zzr r3 = com.google.android.gms.internal.measurement.zzt.zzb(r0)
            r4 = 3
            java.lang.Object r13 = r13.get(r2)
            com.google.android.gms.internal.measurement.zzap r13 = (com.google.android.gms.internal.measurement.zzap) r13
            com.google.android.gms.internal.measurement.zzap r12 = r12.zzb(r13)
            java.lang.String r5 = r12.zzi()
            boolean r7 = r11.zza
            boolean r8 = r11.zzb
            java.util.List r6 = java.util.Collections.emptyList()
            r3.zza(r4, r5, r6, r7, r8)
            com.google.android.gms.internal.measurement.zzap r12 = com.google.android.gms.internal.measurement.zzap.zzf
            return r12
        L30:
            java.lang.Object r0 = r13.get(r2)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r12.zzb(r0)
            java.lang.Double r0 = r0.zzh()
            double r2 = r0.doubleValue()
            int r0 = com.google.android.gms.internal.measurement.zzh.zzb(r2)
            r2 = 3
            r3 = 5
            r4 = 2
            if (r0 == r4) goto L5a
            if (r0 == r2) goto L58
            if (r0 == r3) goto L56
            r5 = 6
            if (r0 == r5) goto L54
            r6 = 3
            goto L5c
        L54:
            r6 = 2
            goto L5c
        L56:
            r6 = 5
            goto L5c
        L58:
            r6 = 1
            goto L5c
        L5a:
            r2 = 4
            r6 = 4
        L5c:
            java.lang.Object r0 = r13.get(r1)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r12.zzb(r0)
            java.lang.String r7 = r0.zzi()
            int r0 = r13.size()
            if (r0 != r4) goto L84
            com.google.android.gms.internal.measurement.zzt r12 = r11.zzc
            boolean r9 = r11.zza
            boolean r10 = r11.zzb
            com.google.android.gms.internal.measurement.zzr r5 = com.google.android.gms.internal.measurement.zzt.zzb(r12)
            java.util.List r8 = java.util.Collections.emptyList()
            r5.zza(r6, r7, r8, r9, r10)
            com.google.android.gms.internal.measurement.zzap r12 = com.google.android.gms.internal.measurement.zzap.zzf
            return r12
        L84:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L89:
            int r0 = r13.size()
            int r0 = java.lang.Math.min(r0, r3)
            if (r4 >= r0) goto La7
            java.lang.Object r0 = r13.get(r4)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r12.zzb(r0)
            java.lang.String r0 = r0.zzi()
            r8.add(r0)
            int r4 = r4 + 1
            goto L89
        La7:
            com.google.android.gms.internal.measurement.zzt r12 = r11.zzc
            boolean r9 = r11.zza
            boolean r10 = r11.zzb
            com.google.android.gms.internal.measurement.zzr r5 = com.google.android.gms.internal.measurement.zzt.zzb(r12)
            r5.zza(r6, r7, r8, r9, r10)
            com.google.android.gms.internal.measurement.zzap r12 = com.google.android.gms.internal.measurement.zzap.zzf
            return r12
    }
}
