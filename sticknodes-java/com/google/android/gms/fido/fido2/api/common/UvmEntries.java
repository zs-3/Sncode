package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "UvmEntriesCreator")
/* loaded from: classes.dex */
public class UvmEntries extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.UvmEntries> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUvmEntryList", id = 1)
    private final java.util.List zza;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private final java.util.List zza;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zza = r0
                return
        }

        public com.google.android.gms.fido.fido2.api.common.UvmEntries.Builder addAll(java.util.List<com.google.android.gms.fido.fido2.api.common.UvmEntry> r3) {
                r2 = this;
                java.util.List r0 = r2.zza
                int r0 = r0.size()
                int r1 = r3.size()
                int r0 = r0 + r1
                r1 = 3
                if (r0 > r1) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                com.google.android.gms.internal.fido.zzam.zzc(r0)
                java.util.List r0 = r2.zza
                r0.addAll(r3)
                return r2
        }

        public com.google.android.gms.fido.fido2.api.common.UvmEntries.Builder addUvmEntry(com.google.android.gms.fido.fido2.api.common.UvmEntry r3) {
                r2 = this;
                java.util.List r0 = r2.zza
                int r0 = r0.size()
                r1 = 3
                if (r0 >= r1) goto Lf
                java.util.List r0 = r2.zza
                r0.add(r3)
                return r2
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                r3.<init>()
                throw r3
        }

        public com.google.android.gms.fido.fido2.api.common.UvmEntries build() {
                r2 = this;
                com.google.android.gms.fido.fido2.api.common.UvmEntries r0 = new com.google.android.gms.fido.fido2.api.common.UvmEntries
                java.util.List r1 = r2.zza
                r0.<init>(r1)
                return r0
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzaz r0 = new com.google.android.gms.fido.fido2.api.common.zzaz
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.UvmEntries.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    UvmEntries(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.fido.fido2.api.common.UvmEntries
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.UvmEntries r5 = (com.google.android.gms.fido.fido2.api.common.UvmEntries) r5
            java.util.List r0 = r4.zza
            r2 = 1
            if (r0 != 0) goto L14
            java.util.List r3 = r5.zza
            if (r3 == 0) goto L12
            goto L14
        L12:
            r1 = 1
            goto L2b
        L14:
            if (r0 == 0) goto L2b
            java.util.List r3 = r5.zza
            if (r3 == 0) goto L2b
            boolean r0 = r0.containsAll(r3)
            if (r0 == 0) goto L2b
            java.util.List r5 = r5.zza
            java.util.List r0 = r4.zza
            boolean r5 = r5.containsAll(r0)
            if (r5 == 0) goto L2b
            goto L12
        L2b:
            return r1
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.UvmEntry> getUvmEntryList() {
            r1 = this;
            java.util.List r0 = r1.zza
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List r2 = r3.zza
            r1.<init>(r2)
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List r0 = r3.getUvmEntryList()
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
