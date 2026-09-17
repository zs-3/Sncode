package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzbh extends com.google.android.gms.internal.measurement.zzaw {
    protected zzbh() {
            r2 = this;
            r2.<init>()
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzA
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzB
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzC
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzD
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzE
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzF
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzG
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzan
            r0.add(r1)
            return
    }

    private static com.google.android.gms.internal.measurement.zzap zzc(com.google.android.gms.internal.measurement.zzbf r3, java.util.Iterator r4, com.google.android.gms.internal.measurement.zzap r5) {
            if (r4 == 0) goto L3b
        L2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzg r0 = r3.zza(r0)
            r1 = r5
            com.google.android.gms.internal.measurement.zzae r1 = (com.google.android.gms.internal.measurement.zzae) r1
            com.google.android.gms.internal.measurement.zzap r0 = r0.zzc(r1)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzag
            if (r1 == 0) goto L2
            com.google.android.gms.internal.measurement.zzag r0 = (com.google.android.gms.internal.measurement.zzag) r0
            java.lang.String r1 = r0.zzc()
            java.lang.String r2 = "break"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzap r3 = com.google.android.gms.internal.measurement.zzap.zzf
            return r3
        L2e:
            java.lang.String r1 = r0.zzc()
            java.lang.String r2 = "return"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2
            return r0
        L3b:
            com.google.android.gms.internal.measurement.zzap r3 = com.google.android.gms.internal.measurement.zzap.zzf
            return r3
    }

    private static com.google.android.gms.internal.measurement.zzap zzd(com.google.android.gms.internal.measurement.zzbf r0, com.google.android.gms.internal.measurement.zzap r1, com.google.android.gms.internal.measurement.zzap r2) {
            java.util.Iterator r1 = r1.zzl()
            com.google.android.gms.internal.measurement.zzap r0 = zzc(r0, r1, r2)
            return r0
    }

    private static com.google.android.gms.internal.measurement.zzap zze(com.google.android.gms.internal.measurement.zzbf r1, com.google.android.gms.internal.measurement.zzap r2, com.google.android.gms.internal.measurement.zzap r3) {
            boolean r0 = r2 instanceof java.lang.Iterable
            if (r0 == 0) goto Lf
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            com.google.android.gms.internal.measurement.zzap r1 = zzc(r1, r2, r3)
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Non-iterable type in for...of loop."
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String r11, com.google.android.gms.internal.measurement.zzg r12, java.util.List r13) {
            r10 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.zza
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzh.zze(r11)
            int r0 = r0.ordinal()
            r1 = 65
            r2 = 4
            java.lang.String r3 = "return"
            java.lang.String r4 = "break"
            r5 = 2
            r6 = 3
            r7 = 1
            r8 = 0
            if (r0 == r1) goto L254
            switch(r0) {
                case 26: goto L213;
                case 27: goto L1d2;
                case 28: goto L191;
                case 29: goto Le2;
                case 30: goto La1;
                case 31: goto L60;
                case 32: goto L1f;
                default: goto L1a;
            }
        L1a:
            com.google.android.gms.internal.measurement.zzap r11 = super.zzb(r11)
            return r11
        L1f:
            com.google.android.gms.internal.measurement.zzbl r11 = com.google.android.gms.internal.measurement.zzbl.zzG
            java.lang.String r11 = r11.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r6, r13)
            java.lang.Object r11 = r13.get(r8)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.zzat
            if (r11 == 0) goto L58
            java.lang.Object r11 = r13.get(r8)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r7)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r12.zzb(r0)
            java.lang.Object r13 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzap r13 = (com.google.android.gms.internal.measurement.zzap) r13
            com.google.android.gms.internal.measurement.zzap r13 = r12.zzb(r13)
            com.google.android.gms.internal.measurement.zzbe r1 = new com.google.android.gms.internal.measurement.zzbe
            r1.<init>(r12, r11)
            com.google.android.gms.internal.measurement.zzap r11 = zze(r1, r0, r13)
            return r11
        L58:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF_LET must be a string"
            r11.<init>(r12)
            throw r11
        L60:
            com.google.android.gms.internal.measurement.zzbl r11 = com.google.android.gms.internal.measurement.zzbl.zzF
            java.lang.String r11 = r11.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r6, r13)
            java.lang.Object r11 = r13.get(r8)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.zzat
            if (r11 == 0) goto L99
            java.lang.Object r11 = r13.get(r8)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r7)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r12.zzb(r0)
            java.lang.Object r13 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzap r13 = (com.google.android.gms.internal.measurement.zzap) r13
            com.google.android.gms.internal.measurement.zzap r13 = r12.zzb(r13)
            com.google.android.gms.internal.measurement.zzbd r1 = new com.google.android.gms.internal.measurement.zzbd
            r1.<init>(r12, r11)
            com.google.android.gms.internal.measurement.zzap r11 = zze(r1, r0, r13)
            return r11
        L99:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF_CONST must be a string"
            r11.<init>(r12)
            throw r11
        La1:
            com.google.android.gms.internal.measurement.zzbl r11 = com.google.android.gms.internal.measurement.zzbl.zzE
            java.lang.String r11 = r11.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r6, r13)
            java.lang.Object r11 = r13.get(r8)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.zzat
            if (r11 == 0) goto Lda
            java.lang.Object r11 = r13.get(r8)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r7)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r12.zzb(r0)
            java.lang.Object r13 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzap r13 = (com.google.android.gms.internal.measurement.zzap) r13
            com.google.android.gms.internal.measurement.zzap r13 = r12.zzb(r13)
            com.google.android.gms.internal.measurement.zzbg r1 = new com.google.android.gms.internal.measurement.zzbg
            r1.<init>(r12, r11)
            com.google.android.gms.internal.measurement.zzap r11 = zze(r1, r0, r13)
            return r11
        Lda:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF must be a string"
            r11.<init>(r12)
            throw r11
        Le2:
            com.google.android.gms.internal.measurement.zzbl r11 = com.google.android.gms.internal.measurement.zzbl.zzD
            java.lang.String r11 = r11.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r2, r13)
            java.lang.Object r11 = r13.get(r8)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            com.google.android.gms.internal.measurement.zzap r11 = r12.zzb(r11)
            boolean r0 = r11 instanceof com.google.android.gms.internal.measurement.zzae
            if (r0 == 0) goto L189
            com.google.android.gms.internal.measurement.zzae r11 = (com.google.android.gms.internal.measurement.zzae) r11
            java.lang.Object r0 = r13.get(r7)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            java.lang.Object r1 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            java.lang.Object r13 = r13.get(r6)
            com.google.android.gms.internal.measurement.zzap r13 = (com.google.android.gms.internal.measurement.zzap) r13
            com.google.android.gms.internal.measurement.zzap r13 = r12.zzb(r13)
            com.google.android.gms.internal.measurement.zzg r2 = r12.zza()
            r5 = 0
        L116:
            int r6 = r11.zzc()
            if (r5 >= r6) goto L12e
            com.google.android.gms.internal.measurement.zzap r6 = r11.zze(r5)
            java.lang.String r6 = r6.zzi()
            com.google.android.gms.internal.measurement.zzap r7 = r12.zzd(r6)
            r2.zzg(r6, r7)
            int r5 = r5 + 1
            goto L116
        L12e:
            com.google.android.gms.internal.measurement.zzap r5 = r12.zzb(r0)
            java.lang.Boolean r5 = r5.zzg()
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L185
            r5 = r13
            com.google.android.gms.internal.measurement.zzae r5 = (com.google.android.gms.internal.measurement.zzae) r5
            com.google.android.gms.internal.measurement.zzap r5 = r12.zzc(r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzag
            if (r6 == 0) goto L163
            com.google.android.gms.internal.measurement.zzag r5 = (com.google.android.gms.internal.measurement.zzag) r5
            java.lang.String r6 = r5.zzc()
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L157
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L2e8
        L157:
            java.lang.String r6 = r5.zzc()
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L163
            goto L2e8
        L163:
            com.google.android.gms.internal.measurement.zzg r5 = r12.zza()
            r6 = 0
        L168:
            int r7 = r11.zzc()
            if (r6 >= r7) goto L180
            com.google.android.gms.internal.measurement.zzap r7 = r11.zze(r6)
            java.lang.String r7 = r7.zzi()
            com.google.android.gms.internal.measurement.zzap r9 = r2.zzd(r7)
            r5.zzg(r7, r9)
            int r6 = r6 + 1
            goto L168
        L180:
            r5.zzb(r1)
            r2 = r5
            goto L12e
        L185:
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L2e8
        L189:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Initializer variables in FOR_LET must be an ArrayList"
            r11.<init>(r12)
            throw r11
        L191:
            com.google.android.gms.internal.measurement.zzbl r11 = com.google.android.gms.internal.measurement.zzbl.zzC
            java.lang.String r11 = r11.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r6, r13)
            java.lang.Object r11 = r13.get(r8)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.zzat
            if (r11 == 0) goto L1ca
            java.lang.Object r11 = r13.get(r8)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r7)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r12.zzb(r0)
            java.lang.Object r13 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzap r13 = (com.google.android.gms.internal.measurement.zzap) r13
            com.google.android.gms.internal.measurement.zzap r13 = r12.zzb(r13)
            com.google.android.gms.internal.measurement.zzbe r1 = new com.google.android.gms.internal.measurement.zzbe
            r1.<init>(r12, r11)
            com.google.android.gms.internal.measurement.zzap r11 = zzd(r1, r0, r13)
            return r11
        L1ca:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN_LET must be a string"
            r11.<init>(r12)
            throw r11
        L1d2:
            com.google.android.gms.internal.measurement.zzbl r11 = com.google.android.gms.internal.measurement.zzbl.zzB
            java.lang.String r11 = r11.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r6, r13)
            java.lang.Object r11 = r13.get(r8)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.zzat
            if (r11 == 0) goto L20b
            java.lang.Object r11 = r13.get(r8)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r7)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r12.zzb(r0)
            java.lang.Object r13 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzap r13 = (com.google.android.gms.internal.measurement.zzap) r13
            com.google.android.gms.internal.measurement.zzap r13 = r12.zzb(r13)
            com.google.android.gms.internal.measurement.zzbd r1 = new com.google.android.gms.internal.measurement.zzbd
            r1.<init>(r12, r11)
            com.google.android.gms.internal.measurement.zzap r11 = zzd(r1, r0, r13)
            return r11
        L20b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN_CONST must be a string"
            r11.<init>(r12)
            throw r11
        L213:
            com.google.android.gms.internal.measurement.zzbl r11 = com.google.android.gms.internal.measurement.zzbl.zzA
            java.lang.String r11 = r11.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r6, r13)
            java.lang.Object r11 = r13.get(r8)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.zzat
            if (r11 == 0) goto L24c
            java.lang.Object r11 = r13.get(r8)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r7)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r12.zzb(r0)
            java.lang.Object r13 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzap r13 = (com.google.android.gms.internal.measurement.zzap) r13
            com.google.android.gms.internal.measurement.zzap r13 = r12.zzb(r13)
            com.google.android.gms.internal.measurement.zzbg r1 = new com.google.android.gms.internal.measurement.zzbg
            r1.<init>(r12, r11)
            com.google.android.gms.internal.measurement.zzap r11 = zzd(r1, r0, r13)
            return r11
        L24c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN must be a string"
            r11.<init>(r12)
            throw r11
        L254:
            com.google.android.gms.internal.measurement.zzbl r11 = com.google.android.gms.internal.measurement.zzbl.zzan
            java.lang.String r11 = r11.name()
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r2, r13)
            java.lang.Object r11 = r13.get(r8)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            java.lang.Object r0 = r13.get(r7)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            java.lang.Object r1 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            java.lang.Object r13 = r13.get(r6)
            com.google.android.gms.internal.measurement.zzap r13 = (com.google.android.gms.internal.measurement.zzap) r13
            com.google.android.gms.internal.measurement.zzap r13 = r12.zzb(r13)
            com.google.android.gms.internal.measurement.zzap r1 = r12.zzb(r1)
            java.lang.Boolean r1 = r1.zzg()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L288
            goto L2ae
        L288:
            r1 = r13
            com.google.android.gms.internal.measurement.zzae r1 = (com.google.android.gms.internal.measurement.zzae) r1
            com.google.android.gms.internal.measurement.zzap r1 = r12.zzc(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzag
            if (r2 == 0) goto L2ae
            r5 = r1
            com.google.android.gms.internal.measurement.zzag r5 = (com.google.android.gms.internal.measurement.zzag) r5
            java.lang.String r1 = r5.zzc()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L2a3
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L2e8
        L2a3:
            java.lang.String r1 = r5.zzc()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L2ae
            goto L2e8
        L2ae:
            com.google.android.gms.internal.measurement.zzap r1 = r12.zzb(r11)
            java.lang.Boolean r1 = r1.zzg()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2e6
            r1 = r13
            com.google.android.gms.internal.measurement.zzae r1 = (com.google.android.gms.internal.measurement.zzae) r1
            com.google.android.gms.internal.measurement.zzap r1 = r12.zzc(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzag
            if (r2 == 0) goto L2e2
            r5 = r1
            com.google.android.gms.internal.measurement.zzag r5 = (com.google.android.gms.internal.measurement.zzag) r5
            java.lang.String r1 = r5.zzc()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L2d7
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L2e8
        L2d7:
            java.lang.String r1 = r5.zzc()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L2e2
            goto L2e8
        L2e2:
            r12.zzb(r0)
            goto L2ae
        L2e6:
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzf
        L2e8:
            return r5
    }
}
