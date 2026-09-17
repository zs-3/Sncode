package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PrfExtensionCreator")
/* loaded from: classes.dex */
public final class zzai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzai> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getEvaluationPoints", id = 1)
    private final byte[][] zza;

    static {
            com.google.android.gms.fido.fido2.api.common.zzaj r0 = new com.google.android.gms.fido.fido2.api.common.zzaj
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.zzai.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzai(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) byte[][] r6) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            int r2 = r6.length
            r2 = r2 & r1
            r2 = r2 ^ r1
            if (r1 == r2) goto L14
            r2 = 0
            goto L15
        L14:
            r2 = 1
        L15:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            r2 = 0
        L19:
            int r3 = r6.length
            if (r2 >= r3) goto L4a
            if (r2 == 0) goto L25
            r3 = r6[r2]
            if (r3 == 0) goto L23
            goto L25
        L23:
            r3 = 0
            goto L26
        L25:
            r3 = 1
        L26:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3)
            int r3 = r2 + 1
            r4 = r6[r3]
            if (r4 == 0) goto L31
            r4 = 1
            goto L32
        L31:
            r4 = 0
        L32:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4)
            r3 = r6[r3]
            int r3 = r3.length
            r4 = 32
            if (r3 == r4) goto L43
            r4 = 64
            if (r3 != r4) goto L41
            goto L43
        L41:
            r3 = 0
            goto L44
        L43:
            r3 = 1
        L44:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3)
            int r2 = r2 + 2
            goto L19
        L4a:
            r5.zza = r6
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.fido.fido2.api.common.zzai
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.gms.fido.fido2.api.common.zzai r2 = (com.google.android.gms.fido.fido2.api.common.zzai) r2
            byte[][] r0 = r1.zza
            byte[][] r2 = r2.zza
            boolean r2 = java.util.Arrays.deepEquals(r0, r2)
            return r2
    }

    public final int hashCode() {
            r7 = this;
            byte[][] r0 = r7.zza
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 0
        L6:
            if (r3 >= r1) goto L17
            r5 = r0[r3]
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r5
            int r5 = com.google.android.gms.common.internal.Objects.hashCode(r6)
            r4 = r4 ^ r5
            int r3 = r3 + 1
            goto L6
        L17:
            return r4
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            byte[][] r0 = r3.zza
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
