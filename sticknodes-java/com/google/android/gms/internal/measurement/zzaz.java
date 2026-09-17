package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzaz extends com.google.android.gms.internal.measurement.zzaw {
    protected zzaz() {
            r2 = this;
            r2.<init>()
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzc
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzl
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzm
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzn
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzt
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzp
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzu
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzz
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzP
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzac
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzaf
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzai
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzaj
            r0.add(r1)
            return
    }

    private static com.google.android.gms.internal.measurement.zzap zzc(com.google.android.gms.internal.measurement.zzg r6, java.util.List r7) {
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.zzz
            java.lang.String r0 = r0.name()
            r1 = 2
            com.google.android.gms.internal.measurement.zzh.zzi(r0, r1, r7)
            r0 = 0
            java.lang.Object r2 = r7.get(r0)
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            com.google.android.gms.internal.measurement.zzap r2 = r6.zzb(r2)
            r3 = 1
            java.lang.Object r4 = r7.get(r3)
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4
            com.google.android.gms.internal.measurement.zzap r4 = r6.zzb(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzae
            if (r5 == 0) goto L47
            com.google.android.gms.internal.measurement.zzae r4 = (com.google.android.gms.internal.measurement.zzae) r4
            java.util.List r0 = r4.zzm()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r7.size()
            if (r4 <= r1) goto L3d
            int r3 = r7.size()
            java.util.List r3 = r7.subList(r1, r3)
        L3d:
            com.google.android.gms.internal.measurement.zzao r7 = new com.google.android.gms.internal.measurement.zzao
            java.lang.String r1 = r2.zzi()
            r7.<init>(r1, r0, r3, r6)
            return r7
        L47:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            r7[r0] = r1
            java.lang.String r0 = "FN requires an ArrayValue of parameter names found %s"
            java.lang.String r7 = java.lang.String.format(r0, r7)
            r6.<init>(r7)
            throw r6
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String r8, com.google.android.gms.internal.measurement.zzg r9, java.util.List r10) {
            r7 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.zza
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzh.zze(r8)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L218
            r5 = 15
            if (r0 == r5) goto L20c
            r5 = 25
            if (r0 == r5) goto L207
            r5 = 41
            if (r0 == r5) goto L1b4
            r5 = 54
            if (r0 == r5) goto L1ae
            r5 = 57
            java.lang.String r6 = "return"
            if (r0 == r5) goto L18a
            r5 = 19
            if (r0 == r5) goto L166
            r5 = 20
            if (r0 == r5) goto L141
            r5 = 60
            if (r0 == r5) goto L8d
            r5 = 61
            if (r0 == r5) goto L58
            switch(r0) {
                case 11: goto L4a;
                case 12: goto L3e;
                case 13: goto L166;
                default: goto L39;
            }
        L39:
            com.google.android.gms.internal.measurement.zzap r8 = super.zzb(r8)
            return r8
        L3e:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.zzm
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r8, r4, r10)
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzi
            return r8
        L4a:
            com.google.android.gms.internal.measurement.zzg r8 = r9.zza()
            com.google.android.gms.internal.measurement.zzae r9 = new com.google.android.gms.internal.measurement.zzae
            r9.<init>(r10)
            com.google.android.gms.internal.measurement.zzap r8 = r8.zzc(r9)
            return r8
        L58:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.zzaj
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            java.lang.Boolean r8 = r8.zzg()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L81
            java.lang.Object r8 = r10.get(r3)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            goto L206
        L81:
            java.lang.Object r8 = r10.get(r2)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            goto L206
        L8d:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.zzai
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r9.zzb(r0)
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.zzap r10 = (com.google.android.gms.internal.measurement.zzap) r10
            com.google.android.gms.internal.measurement.zzap r10 = r9.zzb(r10)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzae
            if (r1 == 0) goto L139
            boolean r1 = r10 instanceof com.google.android.gms.internal.measurement.zzae
            if (r1 == 0) goto L131
            com.google.android.gms.internal.measurement.zzae r0 = (com.google.android.gms.internal.measurement.zzae) r0
            com.google.android.gms.internal.measurement.zzae r10 = (com.google.android.gms.internal.measurement.zzae) r10
            r1 = 0
            r2 = 0
        Lc2:
            int r5 = r0.zzc()
            if (r1 >= r5) goto Lff
            if (r2 != 0) goto Ldb
            com.google.android.gms.internal.measurement.zzap r2 = r0.zze(r1)
            com.google.android.gms.internal.measurement.zzap r2 = r9.zzb(r2)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto Ld9
            goto Ldb
        Ld9:
            r2 = 0
            goto Lfc
        Ldb:
            com.google.android.gms.internal.measurement.zzap r2 = r10.zze(r1)
            com.google.android.gms.internal.measurement.zzap r2 = r9.zzb(r2)
            boolean r5 = r2 instanceof com.google.android.gms.internal.measurement.zzag
            if (r5 == 0) goto Lfb
            r8 = r2
            com.google.android.gms.internal.measurement.zzag r8 = (com.google.android.gms.internal.measurement.zzag) r8
            java.lang.String r8 = r8.zzc()
            java.lang.String r9 = "break"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto Lf8
            goto L204
        Lf8:
            r8 = r2
            goto L206
        Lfb:
            r2 = 1
        Lfc:
            int r1 = r1 + 1
            goto Lc2
        Lff:
            int r8 = r0.zzc()
            int r8 = r8 + r3
            int r1 = r10.zzc()
            if (r8 != r1) goto L204
            int r8 = r0.zzc()
            com.google.android.gms.internal.measurement.zzap r8 = r10.zze(r8)
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            boolean r9 = r8 instanceof com.google.android.gms.internal.measurement.zzag
            if (r9 == 0) goto L204
            r9 = r8
            com.google.android.gms.internal.measurement.zzag r9 = (com.google.android.gms.internal.measurement.zzag) r9
            java.lang.String r9 = r9.zzc()
            boolean r10 = r9.equals(r6)
            if (r10 != 0) goto L206
            java.lang.String r10 = "continue"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L204
            goto L206
        L131:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, case statements are not a list"
            r8.<init>(r9)
            throw r8
        L139:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, cases are not a list"
            r8.<init>(r9)
            throw r8
        L141:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.zzu
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzi(r8, r2, r10)
            com.google.android.gms.internal.measurement.zzap r8 = zzc(r9, r10)
            com.google.android.gms.internal.measurement.zzao r8 = (com.google.android.gms.internal.measurement.zzao) r8
            java.lang.String r10 = r8.zzc()
            if (r10 != 0) goto L15d
            java.lang.String r10 = ""
            r9.zzg(r10, r8)
            goto L206
        L15d:
            java.lang.String r10 = r8.zzc()
            r9.zzg(r10, r8)
            goto L206
        L166:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L170
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L206
        L170:
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            boolean r10 = r8 instanceof com.google.android.gms.internal.measurement.zzae
            if (r10 == 0) goto L186
            com.google.android.gms.internal.measurement.zzae r8 = (com.google.android.gms.internal.measurement.zzae) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzc(r8)
            goto L206
        L186:
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L206
        L18a:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L194
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzj
            goto L206
        L194:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.zzaf
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r8, r3, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            com.google.android.gms.internal.measurement.zzag r9 = new com.google.android.gms.internal.measurement.zzag
            r9.<init>(r6, r8)
            r8 = r9
            goto L206
        L1ae:
            com.google.android.gms.internal.measurement.zzae r8 = new com.google.android.gms.internal.measurement.zzae
            r8.<init>(r10)
            return r8
        L1b4:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.zzP
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzi(r8, r2, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r9.zzb(r0)
            int r1 = r10.size()
            if (r1 <= r2) goto L1e2
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.zzap r10 = (com.google.android.gms.internal.measurement.zzap) r10
            com.google.android.gms.internal.measurement.zzap r10 = r9.zzb(r10)
            goto L1e3
        L1e2:
            r10 = 0
        L1e3:
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzap.zzf
            java.lang.Boolean r8 = r8.zzg()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L1f6
            com.google.android.gms.internal.measurement.zzae r0 = (com.google.android.gms.internal.measurement.zzae) r0
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzc(r0)
            goto L200
        L1f6:
            if (r10 == 0) goto L1ff
            com.google.android.gms.internal.measurement.zzae r10 = (com.google.android.gms.internal.measurement.zzae) r10
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzc(r10)
            goto L200
        L1ff:
            r8 = r1
        L200:
            boolean r9 = r8 instanceof com.google.android.gms.internal.measurement.zzag
            if (r9 != 0) goto L206
        L204:
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzf
        L206:
            return r8
        L207:
            com.google.android.gms.internal.measurement.zzap r8 = zzc(r9, r10)
            return r8
        L20c:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.zzm
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r8, r4, r10)
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzh
            return r8
        L218:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.zzc
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r9.zzb(r0)
            java.lang.String r0 = r0.zzi()
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.zzap r10 = (com.google.android.gms.internal.measurement.zzap) r10
            com.google.android.gms.internal.measurement.zzap r10 = r9.zzb(r10)
            boolean r1 = r10 instanceof com.google.android.gms.internal.measurement.zzae
            if (r1 == 0) goto L260
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L258
            com.google.android.gms.internal.measurement.zzae r10 = (com.google.android.gms.internal.measurement.zzae) r10
            java.util.List r10 = r10.zzm()
            com.google.android.gms.internal.measurement.zzap r8 = r8.zzcz(r0, r9, r10)
            return r8
        L258:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Function name for apply is undefined"
            r8.<init>(r9)
            throw r8
        L260:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            r9[r4] = r10
            java.lang.String r10 = "Function arguments for Apply are not a list found %s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r8.<init>(r9)
            throw r8
    }
}
