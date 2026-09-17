package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class ClassPathUtils {
    public ClassPathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String toFullyQualifiedName(java.lang.Class<?> r4, java.lang.String r5) {
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "context"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Parameter '%s' must not be null!"
            org.apache.commons.lang3.Validate.notNull(r4, r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "resourceName"
            r0[r3] = r1
            org.apache.commons.lang3.Validate.notNull(r5, r2, r0)
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = toFullyQualifiedName(r4, r5)
            return r4
    }

    public static java.lang.String toFullyQualifiedName(java.lang.Package r4, java.lang.String r5) {
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "context"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Parameter '%s' must not be null!"
            org.apache.commons.lang3.Validate.notNull(r4, r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "resourceName"
            r0[r3] = r1
            org.apache.commons.lang3.Validate.notNull(r5, r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "."
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.lang.String toFullyQualifiedPath(java.lang.Class<?> r4, java.lang.String r5) {
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "context"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Parameter '%s' must not be null!"
            org.apache.commons.lang3.Validate.notNull(r4, r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "resourceName"
            r0[r3] = r1
            org.apache.commons.lang3.Validate.notNull(r5, r2, r0)
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = toFullyQualifiedPath(r4, r5)
            return r4
    }

    public static java.lang.String toFullyQualifiedPath(java.lang.Package r4, java.lang.String r5) {
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "context"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Parameter '%s' must not be null!"
            org.apache.commons.lang3.Validate.notNull(r4, r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "resourceName"
            r0[r3] = r1
            org.apache.commons.lang3.Validate.notNull(r5, r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r4.getName()
            r1 = 46
            r2 = 47
            java.lang.String r4 = r4.replace(r1, r2)
            r0.append(r4)
            java.lang.String r4 = "/"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
