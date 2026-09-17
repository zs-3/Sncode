package com.google.android.gms.drive.metadata;

/* loaded from: classes.dex */
public abstract class zza<T> implements com.google.android.gms.drive.metadata.MetadataField<T> {
    private final java.lang.String fieldName;
    private final java.util.Set<java.lang.String> zziw;
    private final java.util.Set<java.lang.String> zzix;
    private final int zziy;

    protected zza(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "fieldName"
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.fieldName = r0
            java.util.Set r2 = java.util.Collections.singleton(r2)
            r1.zziw = r2
            java.util.Set r2 = java.util.Collections.emptySet()
            r1.zzix = r2
            r1.zziy = r3
            return
    }

    protected zza(java.lang.String r2, java.util.Collection<java.lang.String> r3, java.util.Collection<java.lang.String> r4, int r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "fieldName"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.fieldName = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r3)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            r1.zziw = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r4)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            r1.zzix = r2
            r1.zziy = r5
            return
    }

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.fieldName
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.fieldName
            return r0
    }

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final T zza(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "bundle"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = r1.fieldName
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L12
            java.lang.Object r2 = r1.zzb(r2)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final T zza(com.google.android.gms.common.data.DataHolder r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.zzb(r2, r3, r4)
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r1.zzc(r2, r3, r4)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    protected abstract void zza(android.os.Bundle r1, T r2);

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final void zza(com.google.android.gms.common.data.DataHolder r2, com.google.android.gms.drive.metadata.internal.MetadataBundle r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "dataHolder"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "bundle"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r1.zzb(r2, r4, r5)
            if (r0 == 0) goto L17
            java.lang.Object r2 = r1.zzc(r2, r4, r5)
            r3.zzb(r1, r2)
        L17:
            return
    }

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final void zza(T r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.String r0 = "bundle"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            if (r2 != 0) goto Le
            java.lang.String r2 = r1.fieldName
            r0 = 0
            r3.putString(r2, r0)
            return
        Le:
            r1.zza(r3, r2)
            return
    }

    public final java.util.Collection<java.lang.String> zzaz() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.zziw
            return r0
    }

    protected abstract T zzb(android.os.Bundle r1);

    protected boolean zzb(com.google.android.gms.common.data.DataHolder r4, int r5, int r6) {
            r3 = this;
            java.util.Set<java.lang.String> r0 = r3.zziw
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r4.isClosed()
            if (r2 != 0) goto L24
            boolean r2 = r4.hasColumn(r1)
            if (r2 == 0) goto L24
            boolean r1 = r4.hasNull(r1, r5, r6)
            if (r1 == 0) goto L6
        L24:
            r4 = 0
            return r4
        L26:
            r4 = 1
            return r4
    }

    protected abstract T zzc(com.google.android.gms.common.data.DataHolder r1, int r2, int r3);
}
