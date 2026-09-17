package com.google.android.gms.drive.metadata.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AppVisibleCustomPropertiesCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class AppVisibleCustomProperties extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable, java.lang.Iterable<com.google.android.gms.drive.metadata.internal.zzc> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties> CREATOR = null;
    public static final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties zzjb = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final java.util.List<com.google.android.gms.drive.metadata.internal.zzc> zzjc;

    public static class zza {
        private final java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, com.google.android.gms.drive.metadata.internal.zzc> zzjd;

        public zza() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.zzjd = r0
                return
        }

        public final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zza(com.google.android.gms.drive.metadata.CustomPropertyKey r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "key"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, com.google.android.gms.drive.metadata.internal.zzc> r0 = r2.zzjd
                com.google.android.gms.drive.metadata.internal.zzc r1 = new com.google.android.gms.drive.metadata.internal.zzc
                r1.<init>(r3, r4)
                r0.put(r3, r1)
                return r2
        }

        public final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zza(com.google.android.gms.drive.metadata.internal.zzc r3) {
                r2 = this;
                java.lang.String r0 = "property"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, com.google.android.gms.drive.metadata.internal.zzc> r0 = r2.zzjd
                com.google.android.gms.drive.metadata.CustomPropertyKey r1 = r3.zzje
                r0.put(r1, r3)
                return r2
        }

        public final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties zzbb() {
                r2 = this;
                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r0 = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties
                java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, com.google.android.gms.drive.metadata.internal.zzc> r1 = r2.zzjd
                java.util.Collection r1 = r1.values()
                r0.<init>(r1)
                return r0
        }
    }

    static {
            com.google.android.gms.drive.metadata.internal.zza r0 = new com.google.android.gms.drive.metadata.internal.zza
            r0.<init>()
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.CREATOR = r0
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r0 = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza
            r0.<init>()
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r0 = r0.zzbb()
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zzjb = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AppVisibleCustomProperties(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.Collection<com.google.android.gms.drive.metadata.internal.zzc> r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.zzjc = r0
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1e
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties> r1 = com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.class
            if (r0 == r1) goto Lf
            goto L1e
        Lf:
            java.util.Map r0 = r2.zzba()
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r3 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties) r3
            java.util.Map r3 = r3.zzba()
            boolean r3 = r0.equals(r3)
            return r3
        L1e:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.List<com.google.android.gms.drive.metadata.internal.zzc> r1 = r3.zzjc
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<com.google.android.gms.drive.metadata.internal.zzc> iterator() {
            r1 = this;
            java.util.List<com.google.android.gms.drive.metadata.internal.zzc> r0 = r1.zzjc
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List<com.google.android.gms.drive.metadata.internal.zzc> r0 = r3.zzjc
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, java.lang.String> zzba() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.List<com.google.android.gms.drive.metadata.internal.zzc> r1 = r4.zzjc
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<com.google.android.gms.drive.metadata.internal.zzc> r1 = r4.zzjc
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            com.google.android.gms.drive.metadata.internal.zzc r2 = (com.google.android.gms.drive.metadata.internal.zzc) r2
            com.google.android.gms.drive.metadata.CustomPropertyKey r3 = r2.zzje
            java.lang.String r2 = r2.value
            r0.put(r3, r2)
            goto L11
        L25:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }
}
