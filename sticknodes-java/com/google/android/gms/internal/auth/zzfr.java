package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzfr extends java.util.LinkedHashMap {
    private static final com.google.android.gms.internal.auth.zzfr zza = null;
    private boolean zzb;

    static {
            com.google.android.gms.internal.auth.zzfr r0 = new com.google.android.gms.internal.auth.zzfr
            r0.<init>()
            com.google.android.gms.internal.auth.zzfr.zza = r0
            r1 = 0
            r0.zzb = r1
            return
    }

    private zzfr() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zzb = r0
            return
    }

    private zzfr(java.util.Map r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.internal.auth.zzfr zza() {
            com.google.android.gms.internal.auth.zzfr r0 = com.google.android.gms.internal.auth.zzfr.zza
            return r0
    }

    private static int zzf(java.lang.Object r2) {
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L12
            r0 = 0
            byte[] r2 = (byte[]) r2
            byte[] r1 = com.google.android.gms.internal.auth.zzfa.zzd
            int r1 = r2.length
            int r2 = com.google.android.gms.internal.auth.zzfa.zzb(r1, r2, r0, r1)
            if (r2 != 0) goto L11
            r2 = 1
        L11:
            return r2
        L12:
            boolean r0 = r2 instanceof com.google.android.gms.internal.auth.zzex
            if (r0 != 0) goto L1b
            int r2 = r2.hashCode()
            return r2
        L1b:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    private final void zzg() {
            r1 = this;
            boolean r0 = r1.zzb
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
            r0 = this;
            r0.zzg()
            super.clear()
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            java.util.Set r0 = java.util.Collections.emptySet()
            goto Lf
        Lb:
            java.util.Set r0 = super.entrySet()
        Lf:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L58
            java.util.Map r5 = (java.util.Map) r5
            if (r4 != r5) goto L9
            goto L56
        L9:
            int r0 = r4.size()
            int r1 = r5.size()
            if (r0 == r1) goto L14
            goto L58
        L14:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto L4f
            boolean r3 = r1 instanceof byte[]
            if (r3 == 0) goto L4f
            byte[] r2 = (byte[]) r2
            byte[] r1 = (byte[]) r1
            boolean r1 = java.util.Arrays.equals(r2, r1)
            goto L53
        L4f:
            boolean r1 = r2.equals(r1)
        L53:
            if (r1 != 0) goto L1c
            goto L58
        L56:
            r5 = 1
            return r5
        L58:
            r5 = 0
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r4 = this;
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            int r3 = zzf(r3)
            java.lang.Object r2 = r2.getValue()
            int r2 = zzf(r2)
            r2 = r2 ^ r3
            int r1 = r1 + r2
            goto L9
        L28:
            return r1
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r1.zzg()
            byte[] r0 = com.google.android.gms.internal.auth.zzfa.zzd
            java.util.Objects.requireNonNull(r2)
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r2 = super.put(r2, r3)
            return r2
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map r4) {
            r3 = this;
            r3.zzg()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            byte[] r2 = com.google.android.gms.internal.auth.zzfa.zzd
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r1 = r4.get(r1)
            java.util.Objects.requireNonNull(r1)
            goto Lb
        L22:
            super.putAll(r4)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            r0.zzg()
            java.lang.Object r1 = super.remove(r1)
            return r1
    }

    public final com.google.android.gms.internal.auth.zzfr zzb() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.auth.zzfr r0 = new com.google.android.gms.internal.auth.zzfr
            r0.<init>()
            goto L11
        Lc:
            com.google.android.gms.internal.auth.zzfr r0 = new com.google.android.gms.internal.auth.zzfr
            r0.<init>(r1)
        L11:
            return r0
    }

    public final void zzc() {
            r1 = this;
            r0 = 0
            r1.zzb = r0
            return
    }

    public final void zzd(com.google.android.gms.internal.auth.zzfr r2) {
            r1 = this;
            r1.zzg()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            r1.putAll(r2)
        Lc:
            return
    }

    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
