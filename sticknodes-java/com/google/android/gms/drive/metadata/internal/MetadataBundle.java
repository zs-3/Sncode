package com.google.android.gms.drive.metadata.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "MetadataBundleCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class MetadataBundle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.MetadataBundle> CREATOR = null;
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final android.os.Bundle zzjh;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "MetadataBundle"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.android.gms.drive.metadata.internal.MetadataBundle.zzbz = r0
            com.google.android.gms.drive.metadata.internal.zzj r0 = new com.google.android.gms.drive.metadata.internal.zzj
            r0.<init>()
            com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    MetadataBundle(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.Bundle r6) {
            r5 = this;
            r5.<init>()
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            r5.zzjh = r6
            java.lang.Class<com.google.android.gms.drive.metadata.internal.MetadataBundle> r0 = com.google.android.gms.drive.metadata.internal.MetadataBundle.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r6.setClassLoader(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L21:
            boolean r1 = r6.hasNext()
            r2 = 0
            if (r1 == 0) goto L46
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.drive.metadata.MetadataField r3 = com.google.android.gms.drive.metadata.internal.zzf.zzf(r1)
            if (r3 != 0) goto L21
            r0.add(r1)
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.drive.metadata.internal.MetadataBundle.zzbz
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r1
            java.lang.String r1 = "MetadataBundle"
            java.lang.String r2 = "Ignored unknown metadata field in bundle: %s"
            r3.wfmt(r1, r2, r4)
            goto L21
        L46:
            int r6 = r0.size()
        L4a:
            if (r2 >= r6) goto L5a
            java.lang.Object r1 = r0.get(r2)
            int r2 = r2 + 1
            java.lang.String r1 = (java.lang.String) r1
            android.os.Bundle r3 = r5.zzjh
            r3.remove(r1)
            goto L4a
        L5a:
            return
    }

    public static <T> com.google.android.gms.drive.metadata.internal.MetadataBundle zza(com.google.android.gms.drive.metadata.MetadataField<T> r1, T r2) {
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = zzbe()
            r0.zzb(r1, r2)
            return r0
    }

    public static com.google.android.gms.drive.metadata.internal.MetadataBundle zzbe() {
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = new com.google.android.gms.drive.metadata.internal.MetadataBundle
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L49
            java.lang.Class r2 = r7.getClass()
            java.lang.Class<com.google.android.gms.drive.metadata.internal.MetadataBundle> r3 = com.google.android.gms.drive.metadata.internal.MetadataBundle.class
            if (r2 == r3) goto L10
            goto L49
        L10:
            com.google.android.gms.drive.metadata.internal.MetadataBundle r7 = (com.google.android.gms.drive.metadata.internal.MetadataBundle) r7
            android.os.Bundle r2 = r6.zzjh
            java.util.Set r2 = r2.keySet()
            android.os.Bundle r3 = r7.zzjh
            java.util.Set r3 = r3.keySet()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L25
            return r1
        L25:
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.zzjh
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.zzjh
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r4, r3)
            if (r3 != 0) goto L29
            return r1
        L48:
            return r0
        L49:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            android.os.Bundle r0 = r4.zzjh
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r1 * 31
            android.os.Bundle r3 = r4.zzjh
            java.lang.Object r2 = r3.get(r2)
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto Lb
        L25:
            return r1
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            android.os.Bundle r0 = r3.zzjh
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final <T> T zza(com.google.android.gms.drive.metadata.MetadataField<T> r2) {
            r1 = this;
            android.os.Bundle r0 = r1.zzjh
            java.lang.Object r2 = r2.zza(r0)
            return r2
    }

    public final void zza(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<com.google.android.gms.common.data.BitmapTeleporter> r0 = com.google.android.gms.internal.drive.zzhs.zzkq
            java.lang.Object r0 = r1.zza(r0)
            com.google.android.gms.common.data.BitmapTeleporter r0 = (com.google.android.gms.common.data.BitmapTeleporter) r0
            if (r0 == 0) goto L11
            java.io.File r2 = r2.getCacheDir()
            r0.setTempDir(r2)
        L11:
            return
    }

    public final <T> void zzb(com.google.android.gms.drive.metadata.MetadataField<T> r3, T r4) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            com.google.android.gms.drive.metadata.MetadataField r0 = com.google.android.gms.drive.metadata.internal.zzf.zzf(r0)
            if (r0 != 0) goto L2a
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unregistered field: "
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            if (r1 == 0) goto L21
            java.lang.String r3 = r0.concat(r3)
            goto L26
        L21:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L26:
            r4.<init>(r3)
            throw r4
        L2a:
            android.os.Bundle r0 = r2.zzjh
            r3.zza(r4, r0)
            return
    }

    public final com.google.android.gms.drive.metadata.internal.MetadataBundle zzbf() {
            r3 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = new com.google.android.gms.drive.metadata.internal.MetadataBundle
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r2 = r3.zzjh
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public final java.util.Set<com.google.android.gms.drive.metadata.MetadataField<?>> zzbg() {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            android.os.Bundle r1 = r3.zzjh
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.drive.metadata.MetadataField r2 = com.google.android.gms.drive.metadata.internal.zzf.zzf(r2)
            r0.add(r2)
            goto Lf
        L23:
            return r0
    }

    public final <T> T zzc(com.google.android.gms.drive.metadata.MetadataField<T> r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza(r3)
            android.os.Bundle r1 = r2.zzjh
            java.lang.String r3 = r3.getName()
            r1.remove(r3)
            return r0
    }

    public final boolean zzd(com.google.android.gms.drive.metadata.MetadataField<?> r2) {
            r1 = this;
            android.os.Bundle r0 = r1.zzjh
            java.lang.String r2 = r2.getName()
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
