package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzae implements java.lang.Iterable, com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzal {
    final java.util.SortedMap zza;
    final java.util.Map zzb;

    public zzae() {
            r1 = this;
            r1.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.zza = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.zzb = r0
            return
    }

    public zzae(java.util.List r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L18
            r0 = 0
        L6:
            int r1 = r3.size()
            if (r0 >= r1) goto L18
            java.lang.Object r1 = r3.get(r0)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            r2.zzq(r0, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof com.google.android.gms.internal.measurement.zzae
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.measurement.zzae r7 = (com.google.android.gms.internal.measurement.zzae) r7
            int r1 = r6.zzc()
            int r3 = r7.zzc()
            if (r1 == r3) goto L17
            return r2
        L17:
            java.util.SortedMap r1 = r6.zza
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L26
            java.util.SortedMap r7 = r7.zza
            boolean r7 = r7.isEmpty()
            return r7
        L26:
            java.lang.Object r3 = r1.firstKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
        L30:
            java.lang.Object r4 = r1.lastKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 > r4) goto L4e
            com.google.android.gms.internal.measurement.zzap r4 = r6.zze(r3)
            com.google.android.gms.internal.measurement.zzap r5 = r7.zze(r3)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L4b
            return r2
        L4b:
            int r3 = r3 + 1
            goto L30
        L4e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.util.SortedMap r0 = r1.zza
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzad r0 = new com.google.android.gms.internal.measurement.zzad
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ","
            java.lang.String r0 = r1.zzj(r0)
            return r0
    }

    public final int zzb() {
            r1 = this;
            java.util.SortedMap r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    public final int zzc() {
            r2 = this;
            java.util.SortedMap r0 = r2.zza
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.Object r0 = r0.lastKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r2, com.google.android.gms.internal.measurement.zzg r3, java.util.List r4) {
            r1 = this;
            java.lang.String r0 = "concat"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "every"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "filter"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "forEach"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "indexOf"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "join"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "lastIndexOf"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "map"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "pop"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "push"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "reduce"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "reduceRight"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "reverse"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "shift"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "slice"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "some"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "sort"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "splice"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "toString"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "unshift"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La1
            goto Lab
        La1:
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            r0.<init>(r2)
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzaj.zza(r1, r0, r3, r4)
            return r2
        Lab:
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzbb.zza(r2, r1, r3, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
            r5 = this;
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            java.util.SortedMap r1 = r5.zza
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof com.google.android.gms.internal.measurement.zzal
            if (r3 == 0) goto L35
            java.util.SortedMap r3 = r0.zza
            java.lang.Object r4 = r2.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            r3.put(r4, r2)
            goto Lf
        L35:
            java.util.SortedMap r3 = r0.zza
            java.lang.Object r4 = r2.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            com.google.android.gms.internal.measurement.zzap r2 = r2.zzd()
            r3.put(r4, r2)
            goto Lf
        L4b:
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzap zze(int r2) {
            r1 = this;
            int r0 = r1.zzc()
            if (r2 >= r0) goto L1e
            boolean r0 = r1.zzs(r2)
            if (r0 == 0) goto L1b
            java.util.SortedMap r0 = r1.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            if (r2 == 0) goto L1b
            return r2
        L1b:
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzf
            return r2
        L1e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final com.google.android.gms.internal.measurement.zzap zzf(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L17
            com.google.android.gms.internal.measurement.zzah r3 = new com.google.android.gms.internal.measurement.zzah
            int r0 = r2.zzc()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L17:
            boolean r0 = r2.zzt(r3)
            if (r0 == 0) goto L28
            java.util.Map r0 = r2.zzb
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            if (r3 == 0) goto L28
            return r3
        L28:
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
            r3 = this;
            java.util.SortedMap r0 = r3.zza
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L13
            r0 = 0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zze(r0)
            java.lang.Double r0 = r0.zzh()
            return r0
        L13:
            int r0 = r0.size()
            if (r0 > 0) goto L20
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L20:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
            r1 = this;
            java.lang.String r0 = ","
            java.lang.String r0 = r1.zzj(r0)
            return r0
    }

    public final java.lang.String zzj(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.SortedMap r1 = r5.zza
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3b
            r1 = 0
            r2 = 0
        Lf:
            if (r6 != 0) goto L14
            java.lang.String r3 = ""
            goto L15
        L14:
            r3 = r6
        L15:
            int r4 = r5.zzc()
            if (r2 >= r4) goto L34
            com.google.android.gms.internal.measurement.zzap r4 = r5.zze(r2)
            r0.append(r3)
            boolean r3 = r4 instanceof com.google.android.gms.internal.measurement.zzau
            if (r3 != 0) goto L31
            boolean r3 = r4 instanceof com.google.android.gms.internal.measurement.zzan
            if (r3 != 0) goto L31
            java.lang.String r3 = r4.zzi()
            r0.append(r3)
        L31:
            int r2 = r2 + 1
            goto Lf
        L34:
            int r6 = r3.length()
            r0.delete(r1, r6)
        L3b:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public final java.util.Iterator zzk() {
            r1 = this;
            java.util.SortedMap r0 = r1.zza
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
            r3 = this;
            java.util.SortedMap r0 = r3.zza
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.Map r1 = r3.zzb
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            com.google.android.gms.internal.measurement.zzac r2 = new com.google.android.gms.internal.measurement.zzac
            r2.<init>(r3, r0, r1)
            return r2
    }

    public final java.util.List zzm() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.zzc()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r3.zzc()
            if (r1 >= r2) goto L1a
            com.google.android.gms.internal.measurement.zzap r2 = r3.zze(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto La
        L1a:
            return r0
    }

    public final void zzn() {
            r1 = this;
            java.util.SortedMap r0 = r1.zza
            r0.clear()
            return
    }

    public final void zzo(int r6, com.google.android.gms.internal.measurement.zzap r7) {
            r5 = this;
            if (r6 < 0) goto L35
            int r0 = r5.zzc()
            if (r6 < r0) goto Lc
            r5.zzq(r6, r7)
            return
        Lc:
            java.util.SortedMap r0 = r5.zza
            java.lang.Object r1 = r0.lastKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L18:
            if (r1 < r6) goto L31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            if (r3 == 0) goto L2e
            int r4 = r1 + 1
            r5.zzq(r4, r3)
            r0.remove(r2)
        L2e:
            int r1 = r1 + (-1)
            goto L18
        L31:
            r5.zzq(r6, r7)
            return
        L35:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid value index: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
    }

    public final void zzp(int r5) {
            r4 = this;
            java.util.SortedMap r0 = r4.zza
            java.lang.Object r1 = r0.lastKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r5 > r1) goto L55
            if (r5 >= 0) goto L11
            goto L55
        L11:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0.remove(r2)
            if (r5 != r1) goto L2e
            int r5 = r5 + (-1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r2 = r0.containsKey(r1)
            if (r2 != 0) goto L55
            if (r5 < 0) goto L55
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzf
            r0.put(r1, r5)
            return
        L2e:
            int r5 = r5 + 1
            java.lang.Object r1 = r0.lastKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r5 > r1) goto L55
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            if (r2 == 0) goto L2e
            int r3 = r5 + (-1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r2)
            r0.remove(r1)
            goto L2e
        L55:
            return
    }

    public final void zzq(int r3, com.google.android.gms.internal.measurement.zzap r4) {
            r2 = this;
            r0 = 32468(0x7ed4, float:4.5497E-41)
            if (r3 > r0) goto L33
            if (r3 < 0) goto L1c
            if (r4 != 0) goto L12
            java.util.SortedMap r4 = r2.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.remove(r3)
            return
        L12:
            java.util.SortedMap r0 = r2.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r4)
            return
        L1c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Out of bounds index: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L33:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Array too large"
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(java.lang.String r2, com.google.android.gms.internal.measurement.zzap r3) {
            r1 = this;
            if (r3 != 0) goto L8
            java.util.Map r3 = r1.zzb
            r3.remove(r2)
            return
        L8:
            java.util.Map r0 = r1.zzb
            r0.put(r2, r3)
            return
    }

    public final boolean zzs(int r4) {
            r3 = this;
            if (r4 < 0) goto L19
            java.util.SortedMap r0 = r3.zza
            java.lang.Object r1 = r0.lastKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r4 > r1) goto L19
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r0.containsKey(r4)
            return r4
        L19:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Out of bounds index: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L13
            java.util.Map r0 = r1.zzb
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }
}
