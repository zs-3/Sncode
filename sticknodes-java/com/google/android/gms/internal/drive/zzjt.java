package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzjt implements com.google.android.gms.internal.drive.zzns {
    private final com.google.android.gms.internal.drive.zzjr zznx;

    private zzjt(com.google.android.gms.internal.drive.zzjr r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "output"
            java.lang.Object r2 = com.google.android.gms.internal.drive.zzkm.zza(r2, r0)
            com.google.android.gms.internal.drive.zzjr r2 = (com.google.android.gms.internal.drive.zzjr) r2
            r1.zznx = r2
            r2.zzoh = r1
            return
    }

    public static com.google.android.gms.internal.drive.zzjt zza(com.google.android.gms.internal.drive.zzjr r1) {
            com.google.android.gms.internal.drive.zzjt r0 = r1.zzoh
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.drive.zzjt r0 = new com.google.android.gms.internal.drive.zzjt
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r2, double r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zza(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r2, float r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zza(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zza(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r2, com.google.android.gms.internal.drive.zzjc r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zza(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final <K, V> void zza(int r5, com.google.android.gms.internal.drive.zzlj<K, V> r6, java.util.Map<K, V> r7) throws java.io.IOException {
            r4 = this;
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            com.google.android.gms.internal.drive.zzjr r1 = r4.zznx
            r2 = 2
            r1.zzb(r5, r2)
            com.google.android.gms.internal.drive.zzjr r1 = r4.zznx
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            int r2 = com.google.android.gms.internal.drive.zzli.zza(r6, r2, r3)
            r1.zzy(r2)
            com.google.android.gms.internal.drive.zzjr r1 = r4.zznx
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.drive.zzli.zza(r1, r6, r2, r0)
            goto L8
        L39:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.drive.zzjc
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            com.google.android.gms.internal.drive.zzjc r3 = (com.google.android.gms.internal.drive.zzjc) r3
            r0.zzb(r2, r3)
            return
        Lc:
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            com.google.android.gms.internal.drive.zzlq r3 = (com.google.android.gms.internal.drive.zzlq) r3
            r0.zza(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r2, java.lang.Object r3, com.google.android.gms.internal.drive.zzmf r4) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            com.google.android.gms.internal.drive.zzlq r3 = (com.google.android.gms.internal.drive.zzlq) r3
            r0.zza(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zza(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r5, java.util.List<java.lang.String> r6) throws java.io.IOException {
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.gms.internal.drive.zzkz
            r1 = 0
            if (r0 == 0) goto L29
            r0 = r6
            com.google.android.gms.internal.drive.zzkz r0 = (com.google.android.gms.internal.drive.zzkz) r0
        L8:
            int r2 = r6.size()
            if (r1 >= r2) goto L28
            java.lang.Object r2 = r0.zzao(r1)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L1e
            com.google.android.gms.internal.drive.zzjr r3 = r4.zznx
            java.lang.String r2 = (java.lang.String) r2
            r3.zza(r5, r2)
            goto L25
        L1e:
            com.google.android.gms.internal.drive.zzjr r3 = r4.zznx
            com.google.android.gms.internal.drive.zzjc r2 = (com.google.android.gms.internal.drive.zzjc) r2
            r3.zza(r5, r2)
        L25:
            int r1 = r1 + 1
            goto L8
        L28:
            return
        L29:
            int r0 = r6.size()
            if (r1 >= r0) goto L3d
            com.google.android.gms.internal.drive.zzjr r0 = r4.zznx
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.zza(r5, r2)
            int r1 = r1 + 1
            goto L29
        L3d:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r3, java.util.List<?> r4, com.google.android.gms.internal.drive.zzmf r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.zza(r3, r1, r5)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            r1 = 2
            r5.zzb(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzac(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            r3.zzy(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L40
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.zzx(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r5 = r4.size()
            if (r0 >= r5) goto L59
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.zzc(r3, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzak(int r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r2.zznx
            r1 = 3
            r0.zzb(r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzal(int r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r2.zznx
            r1 = 4
            r0.zzb(r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zzb(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int r3, java.lang.Object r4, com.google.android.gms.internal.drive.zzmf r5) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r2.zznx
            com.google.android.gms.internal.drive.zzlq r4 = (com.google.android.gms.internal.drive.zzlq) r4
            r1 = 3
            r0.zzb(r3, r1)
            com.google.android.gms.internal.drive.zzjt r1 = r0.zzoh
            r5.zza(r4, r1)
            r4 = 4
            r0.zzb(r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int r4, java.util.List<com.google.android.gms.internal.drive.zzjc> r5) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L15
            com.google.android.gms.internal.drive.zzjr r1 = r3.zznx
            java.lang.Object r2 = r5.get(r0)
            com.google.android.gms.internal.drive.zzjc r2 = (com.google.android.gms.internal.drive.zzjc) r2
            r1.zza(r4, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int r3, java.util.List<?> r4, com.google.android.gms.internal.drive.zzmf r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.zzb(r3, r1, r5)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            r1 = 2
            r5.zzb(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzaf(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            r3.zzy(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L40
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.zzaa(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r5 = r4.size()
            if (r0 >= r5) goto L59
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.zzf(r3, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int r2, boolean r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zzb(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzc(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zzc(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzc(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zzc(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzc(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            r1 = 2
            r6.zzb(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzo(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            r4.zzy(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L40
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.zzl(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r6 = r5.size()
            if (r0 >= r6) goto L59
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.zza(r4, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final int zzcd() {
            r1 = this;
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsi
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzd(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zzd(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzd(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            r1 = 2
            r6.zzb(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzp(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            r4.zzy(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L40
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.zzl(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r6 = r5.size()
            if (r0 >= r6) goto L59
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.zza(r4, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zze(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zze(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zze(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            r1 = 2
            r6.zzb(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzr(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            r4.zzy(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L40
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.zzn(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r6 = r5.size()
            if (r0 >= r6) goto L59
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.zzc(r4, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzf(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zzf(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzf(int r3, java.util.List<java.lang.Float> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            r1 = 2
            r5.zzb(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzb(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            r3.zzy(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L40
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            java.lang.Object r5 = r4.get(r0)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r3.zza(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r5 = r4.size()
            if (r0 >= r5) goto L59
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            java.lang.Object r1 = r4.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r5.zza(r3, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzg(int r4, java.util.List<java.lang.Double> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            r1 = 2
            r6.zzb(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzb(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            r4.zzy(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L40
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            java.lang.Object r6 = r5.get(r0)
            java.lang.Double r6 = (java.lang.Double) r6
            double r1 = r6.doubleValue()
            r4.zza(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r6 = r5.size()
            if (r0 >= r6) goto L59
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            java.lang.Object r1 = r5.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r6.zza(r4, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzh(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            r1 = 2
            r5.zzb(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzah(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            r3.zzy(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L40
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.zzx(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r5 = r4.size()
            if (r0 >= r5) goto L59
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.zzc(r3, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzi(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zza(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzi(int r3, java.util.List<java.lang.Boolean> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            r1 = 2
            r5.zzb(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzd(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            r3.zzy(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L40
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            java.lang.Object r5 = r4.get(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r3.zzc(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r5 = r4.size()
            if (r0 >= r5) goto L59
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            java.lang.Object r1 = r4.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5.zzb(r3, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzj(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zzc(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzj(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            r1 = 2
            r5.zzb(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzad(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            r3.zzy(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L40
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.zzy(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r5 = r4.size()
            if (r0 >= r5) goto L59
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.zzd(r3, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzk(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            r1 = 2
            r5.zzb(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzag(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            r3.zzy(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L40
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.zzaa(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r5 = r4.size()
            if (r0 >= r5) goto L59
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.zzf(r3, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzl(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            r1 = 2
            r6.zzb(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzs(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            r4.zzy(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L40
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.zzn(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r6 = r5.size()
            if (r0 >= r6) goto L59
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.zzc(r4, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzm(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zzf(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzm(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            r1 = 2
            r5.zzb(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzae(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            r3.zzy(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L40
            com.google.android.gms.internal.drive.zzjr r3 = r2.zznx
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.zzz(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r5 = r4.size()
            if (r0 >= r5) goto L59
            com.google.android.gms.internal.drive.zzjr r5 = r2.zznx
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.zze(r3, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzn(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            r0.zzc(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzn(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L41
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            r1 = 2
            r6.zzb(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzq(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            r4.zzy(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L40
            com.google.android.gms.internal.drive.zzjr r4 = r3.zznx
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.zzm(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            return
        L41:
            int r6 = r5.size()
            if (r0 >= r6) goto L59
            com.google.android.gms.internal.drive.zzjr r6 = r3.zznx
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.zzb(r4, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }
}
