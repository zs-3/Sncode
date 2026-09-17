package com.google.android.gms.drive.metadata.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CustomPropertyCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.zzc> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    final java.lang.String value;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final com.google.android.gms.drive.metadata.CustomPropertyKey zzje;

    static {
            com.google.android.gms.drive.metadata.internal.zzd r0 = new com.google.android.gms.drive.metadata.internal.zzd
            r0.<init>()
            com.google.android.gms.drive.metadata.internal.zzc.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzc(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.metadata.CustomPropertyKey r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "key"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zzje = r2
            r1.value = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<com.google.android.gms.drive.metadata.internal.zzc> r3 = com.google.android.gms.drive.metadata.internal.zzc.class
            if (r2 == r3) goto L10
            goto L27
        L10:
            com.google.android.gms.drive.metadata.internal.zzc r5 = (com.google.android.gms.drive.metadata.internal.zzc) r5
            com.google.android.gms.drive.metadata.CustomPropertyKey r2 = r4.zzje
            com.google.android.gms.drive.metadata.CustomPropertyKey r3 = r5.zzje
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L27
            java.lang.String r2 = r4.value
            java.lang.String r5 = r5.value
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r2, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.drive.metadata.CustomPropertyKey r1 = r3.zzje
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.value
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.metadata.CustomPropertyKey r1 = r4.zzje
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.value
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
