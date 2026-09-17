package kotlin.jvm.internal;

/* compiled from: PackageReference.kt */
/* loaded from: classes2.dex */
public final class PackageReference implements kotlin.jvm.internal.ClassBasedDeclarationContainer {
    private final java.lang.Class<?> jClass;
    private final java.lang.String moduleName;

    public PackageReference(java.lang.Class<?> r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "moduleName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.jClass = r2
            r1.moduleName = r3
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.jvm.internal.PackageReference
            if (r0 == 0) goto L16
            java.lang.Class r0 = r1.getJClass()
            kotlin.jvm.internal.PackageReference r2 = (kotlin.jvm.internal.PackageReference) r2
            java.lang.Class r2 = r2.getJClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public java.lang.Class<?> getJClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.jClass
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.getJClass()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getJClass()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
