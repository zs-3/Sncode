package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzl extends com.google.android.gms.internal.measurement.zzam {
    private final com.google.android.gms.internal.measurement.zzab zzb;

    public zzl(com.google.android.gms.internal.measurement.zzab r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzam, com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r17, com.google.android.gms.internal.measurement.zzg r18, java.util.List r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L49;
                case 45521504: goto L41;
                case 146575578: goto L39;
                case 700587132: goto L31;
                case 920706790: goto L29;
                case 1570616835: goto L21;
                default: goto L20;
            }
        L20:
            goto L51
        L21:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L51
            r4 = 4
            goto L52
        L29:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L51
            r4 = 5
            goto L52
        L31:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L51
            r4 = 2
            goto L52
        L39:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L51
            r4 = 1
            goto L52
        L41:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L51
            r4 = 3
            goto L52
        L49:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L51
            r4 = 0
            goto L52
        L51:
            r4 = -1
        L52:
            if (r4 == 0) goto L134
            if (r4 == r15) goto L114
            if (r4 == r14) goto Le1
            if (r4 == r7) goto Lc9
            if (r4 == r6) goto L8d
            r6 = 5
            if (r4 == r6) goto L64
            com.google.android.gms.internal.measurement.zzap r1 = super.zzcz(r17, r18, r19)
            return r1
        L64:
            com.google.android.gms.internal.measurement.zzh.zzh(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r2.zzb(r1)
            java.lang.String r1 = r1.zzi()
            java.lang.Object r3 = r3.get(r15)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            com.google.android.gms.internal.measurement.zzap r2 = r2.zzb(r3)
            com.google.android.gms.internal.measurement.zzab r3 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r3 = r3.zzb()
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzh.zzf(r2)
            r3.zzh(r1, r4)
            return r2
        L8d:
            com.google.android.gms.internal.measurement.zzh.zzh(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r2.zzb(r1)
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzf
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lc1
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzg
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lc1
            com.google.android.gms.internal.measurement.zzab r2 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r2 = r2.zzb()
            java.lang.String r3 = r1.zzi()
            r2.zzg(r3)
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.zzi()
            r2.<init>(r1)
            return r2
        Lc1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        Lc9:
            com.google.android.gms.internal.measurement.zzh.zzh(r12, r5, r3)
            com.google.android.gms.internal.measurement.zzab r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r1 = r1.zzb()
            com.google.android.gms.internal.measurement.zzah r2 = new com.google.android.gms.internal.measurement.zzah
            long r3 = r1.zza()
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        Le1:
            com.google.android.gms.internal.measurement.zzh.zzh(r10, r5, r3)
            com.google.android.gms.internal.measurement.zzab r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r1 = r1.zzb()
            java.util.Map r1 = r1.zzf()
            com.google.android.gms.internal.measurement.zzam r2 = new com.google.android.gms.internal.measurement.zzam
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        Lfb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L113
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzi.zzb(r5)
            r2.zzr(r4, r5)
            goto Lfb
        L113:
            return r2
        L114:
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r2.zzb(r1)
            java.lang.String r1 = r1.zzi()
            com.google.android.gms.internal.measurement.zzab r2 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r2 = r2.zzb()
            java.lang.Object r1 = r2.zzc(r1)
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzi.zzb(r1)
            return r1
        L134:
            com.google.android.gms.internal.measurement.zzh.zzh(r13, r5, r3)
            com.google.android.gms.internal.measurement.zzab r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r1 = r1.zzb()
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.zze()
            r2.<init>(r1)
            return r2
    }
}
