package com.sticknodes.viewer;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.Disposable;

public class SNShapeRenderer implements Disposable {
    private final ImmediateModeRenderer20 renderer;
    private final Color setColor1 = new Color();
    private final Color setColor2 = new Color();
    private final Color tempColor = new Color();

    public static abstract class ColorInterpolator {
        protected Color fromColorRef;
        protected Color toColorRef;
        protected Color tempColor = new Color();

        public abstract float getBits(float progress, float total, float alpha);

        public void setColors(Color from, Color to) {
            this.fromColorRef = from;
            this.toColorRef = to;
        }

        public static class ColorInterpolatorX extends ColorInterpolator {
            @Override
            public float getBits(float progress, float total, float alpha) {
                if (fromColorRef == null || toColorRef == null) return Color.BLACK.toFloatBits();
                tempColor.set(fromColorRef).lerp(toColorRef, progress / (total == 0 ? 1.0f : total));
                tempColor.a *= alpha;
                return tempColor.toFloatBits();
            }
        }

        public static class ColorInterpolatorY extends ColorInterpolator {
            @Override
            public float getBits(float progress, float total, float alpha) {
                if (fromColorRef == null || toColorRef == null) return Color.BLACK.toFloatBits();
                tempColor.set(fromColorRef).lerp(toColorRef, alpha);
                return tempColor.toFloatBits();
            }
        }
    }

    public SNShapeRenderer() {
        this.renderer = new ImmediateModeRenderer20(10000, false, true, 0);
    }

    public void begin(Matrix4 combinedMatrix, int primitiveType) {
        renderer.begin(combinedMatrix, primitiveType);
    }

    public void end() {
        renderer.end();
    }

    public void flush() {}

    public void mySegment(float x1, float y1, float x2, float y2, float thickness, float cosAngle, float sinAngle, boolean useGradient, Color c1, Color c2) {
        float halfT = thickness * 0.5f;
        float nx = -sinAngle * halfT;
        float ny = cosAngle * halfT;

        float bits1 = c1.toFloatBits();
        float bits2 = useGradient && c2 != null ? c2.toFloatBits() : bits1;

        renderer.color(bits1);
        renderer.vertex(x1 + nx, y1 + ny, 0);
        renderer.color(bits1);
        renderer.vertex(x1 - nx, y1 - ny, 0);
        renderer.color(bits2);
        renderer.vertex(x2 - nx, y2 - ny, 0);

        renderer.color(bits1);
        renderer.vertex(x1 + nx, y1 + ny, 0);
        renderer.color(bits2);
        renderer.vertex(x2 - nx, y2 - ny, 0);
        renderer.color(bits2);
        renderer.vertex(x2 + nx, y2 + ny, 0);
    }

    public void mySegmentCurved(float x1, float y1, float x2, float y2, float thickness, float radius, Color c1, Color c2) {
        mySegment(x1, y1, x2, y2, thickness, 1.0f, 0.0f, c2 != null, c1, c2);
    }

    public void myRoundedSegment(float x1, float y1, float x2, float y2, float thickness, float cosAngle, float sinAngle, boolean useGradient, Color c1, Color c2) {
        mySegment(x1, y1, x2, y2, thickness, cosAngle, sinAngle, useGradient, c1, c2);
        circle(x1, y1, thickness * 0.5f, 16, c1, c1);
        circle(x2, y2, thickness * 0.5f, 16, c2 != null ? c2 : c1, c2 != null ? c2 : c1);
    }

    public void myTrapezoid(float x1, float y1, float x2, float y2, float t1, float t2, float cosAngle, float sinAngle, boolean useGradient, Color c1, Color c2) {
        float halfT1 = t1 * 0.5f;
        float halfT2 = t2 * 0.5f;

        float nx1 = -sinAngle * halfT1;
        float ny1 = cosAngle * halfT1;
        float nx2 = -sinAngle * halfT2;
        float ny2 = cosAngle * halfT2;

        float bits1 = c1.toFloatBits();
        float bits2 = useGradient && c2 != null ? c2.toFloatBits() : bits1;

        renderer.color(bits1);
        renderer.vertex(x1 + nx1, y1 + ny1, 0);
        renderer.color(bits1);
        renderer.vertex(x1 - nx1, y1 - ny1, 0);
        renderer.color(bits2);
        renderer.vertex(x2 - nx2, y2 - ny2, 0);

        renderer.color(bits1);
        renderer.vertex(x1 + nx1, y1 + ny1, 0);
        renderer.color(bits2);
        renderer.vertex(x2 - nx2, y2 - ny2, 0);
        renderer.color(bits2);
        renderer.vertex(x2 + nx2, y2 + ny2, 0);
    }

    public void myRoundedTrapezoid(float x1, float y1, float x2, float y2, float t1, float t2, float cosAngle, float sinAngle, boolean useGradient, Color c1, Color c2) {
        myTrapezoid(x1, y1, x2, y2, t1, t2, cosAngle, sinAngle, useGradient, c1, c2);
        circle(x1, y1, t1 * 0.5f, 16, c1, c1);
        circle(x2, y2, t2 * 0.5f, 16, c2 != null ? c2 : c1, c2 != null ? c2 : c1);
    }

    public void myTrapezoidCurved(float x1, float y1, float x2, float y2, float t1, float t2, float radius, Color c1, Color c2) {
        myTrapezoid(x1, y1, x2, y2, t1, t2, 1.0f, 0.0f, c2 != null, c1, c2);
    }

    public void circle(float cx, float cy, float radius, int segments, Color c1, Color c2) {
        int segs = Math.max(8, segments);
        float angleStep = (float) (2 * Math.PI / segs);
        float bits = c1.toFloatBits();

        for (int i = 0; i < segs; i++) {
            float a1 = i * angleStep;
            float a2 = (i + 1) * angleStep;

            float px1 = cx + (float) (Math.cos(a1) * radius);
            float py1 = cy + (float) (Math.sin(a1) * radius);
            float px2 = cx + (float) (Math.cos(a2) * radius);
            float py2 = cy + (float) (Math.sin(a2) * radius);

            renderer.color(bits);
            renderer.vertex(cx, cy, 0);
            renderer.color(bits);
            renderer.vertex(px1, py1, 0);
            renderer.color(bits);
            renderer.vertex(px2, py2, 0);
        }
    }

    public void circleOutline(float cx, float cy, float outerRadius, float innerRadius, int segments, Color color) {
        int segs = Math.max(8, segments);
        float angleStep = (float) (2 * Math.PI / segs);
        float bits = color.toFloatBits();

        for (int i = 0; i < segs; i++) {
            float a1 = i * angleStep;
            float a2 = (i + 1) * angleStep;

            float ox1 = cx + (float) (Math.cos(a1) * outerRadius);
            float oy1 = cy + (float) (Math.sin(a1) * outerRadius);
            float ix1 = cx + (float) (Math.cos(a1) * innerRadius);
            float iy1 = cy + (float) (Math.sin(a1) * innerRadius);

            float ox2 = cx + (float) (Math.cos(a2) * outerRadius);
            float oy2 = cy + (float) (Math.sin(a2) * outerRadius);
            float ix2 = cx + (float) (Math.cos(a2) * innerRadius);
            float iy2 = cy + (float) (Math.sin(a2) * innerRadius);

            renderer.color(bits); renderer.vertex(ox1, oy1, 0);
            renderer.color(bits); renderer.vertex(ix1, iy1, 0);
            renderer.color(bits); renderer.vertex(ix2, iy2, 0);

            renderer.color(bits); renderer.vertex(ox1, oy1, 0);
            renderer.color(bits); renderer.vertex(ix2, iy2, 0);
            renderer.color(bits); renderer.vertex(ox2, oy2, 0);
        }
    }

    public void halfCircle(float cx, float cy, float radius, int segments, float startAngle, Color c1, Color c2) {
        int segs = Math.max(4, segments / 2);
        float angleStep = (float) (Math.PI / segs);
        float bits = c1.toFloatBits();

        for (int i = 0; i < segs; i++) {
            float a1 = startAngle + i * angleStep;
            float a2 = startAngle + (i + 1) * angleStep;

            float px1 = cx + (float) (Math.cos(a1) * radius);
            float py1 = cy + (float) (Math.sin(a1) * radius);
            float px2 = cx + (float) (Math.cos(a2) * radius);
            float py2 = cy + (float) (Math.sin(a2) * radius);

            renderer.color(bits); renderer.vertex(cx, cy, 0);
            renderer.color(bits); renderer.vertex(px1, py1, 0);
            renderer.color(bits); renderer.vertex(px2, py2, 0);
        }
    }

    public void ellipse(float cx, float cy, float rx, float ry, int segments, float rotation, Color c1, Color c2) {
        int segs = Math.max(8, segments);
        float angleStep = (float) (2 * Math.PI / segs);
        float bits = c1.toFloatBits();
        float radRot = (float) Math.toRadians(rotation);

        for (int i = 0; i < segs; i++) {
            float a1 = i * angleStep;
            float a2 = (i + 1) * angleStep;

            float lx1 = (float) (Math.cos(a1) * rx);
            float ly1 = (float) (Math.sin(a1) * ry);
            float lx2 = (float) (Math.cos(a2) * rx);
            float ly2 = (float) (Math.sin(a2) * ry);

            float px1 = cx + lx1 * (float) Math.cos(radRot) - ly1 * (float) Math.sin(radRot);
            float py1 = cy + lx1 * (float) Math.sin(radRot) + ly1 * (float) Math.cos(radRot);
            float px2 = cx + lx2 * (float) Math.cos(radRot) - ly2 * (float) Math.sin(radRot);
            float py2 = cy + lx2 * (float) Math.sin(radRot) + ly2 * (float) Math.cos(radRot);

            renderer.color(bits); renderer.vertex(cx, cy, 0);
            renderer.color(bits); renderer.vertex(px1, py1, 0);
            renderer.color(bits); renderer.vertex(px2, py2, 0);
        }
    }

    public void halfEllipse(float cx, float cy, float rx, float ry, int segments, float rotation, Color c1, Color c2) {
        ellipse(cx, cy, rx, ry, segments, rotation, c1, c2);
    }

    public void polygon(float cx, float cy, float radius, int sides, float angle, Color c1, Color c2) {
        int segs = Math.max(3, sides);
        float angleStep = (float) (2 * Math.PI / segs);
        float radAngle = (float) Math.toRadians(angle);
        float bits = c1.toFloatBits();

        for (int i = 0; i < segs; i++) {
            float a1 = radAngle + i * angleStep;
            float a2 = radAngle + (i + 1) * angleStep;

            float px1 = cx + (float) (Math.cos(a1) * radius);
            float py1 = cy + (float) (Math.sin(a1) * radius);
            float px2 = cx + (float) (Math.cos(a2) * radius);
            float py2 = cy + (float) (Math.sin(a2) * radius);

            renderer.color(bits); renderer.vertex(cx, cy, 0);
            renderer.color(bits); renderer.vertex(px1, py1, 0);
            renderer.color(bits); renderer.vertex(px2, py2, 0);
        }
    }

    public void triangle(float x1, float y1, float x2, float y2, float x3, float y3, Color c1, Color c2) {
        float bits1 = c1.toFloatBits();
        float bits2 = c2 != null ? c2.toFloatBits() : bits1;

        renderer.color(bits1); renderer.vertex(x1, y1, 0);
        renderer.color(bits1); renderer.vertex(x2, y2, 0);
        renderer.color(bits2); renderer.vertex(x3, y3, 0);
    }

    public void triangleLine(float x1, float y1, float x2, float y2, float x3, float y3, float thickness, Color color) {
        rectLine(x1, y1, x2, y2, thickness, color);
        rectLine(x2, y2, x3, y3, thickness, color);
        rectLine(x3, y3, x1, y1, thickness, color);
    }

    public void rectLine(float x1, float y1, float x2, float y2, float thickness, Color color) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float len = (float) Math.hypot(dx, dy);
        if (len == 0) return;

        float nx = -dy / len * (thickness * 0.5f);
        float ny = dx / len * (thickness * 0.5f);
        float bits = color.toFloatBits();

        renderer.color(bits); renderer.vertex(x1 + nx, y1 + ny, 0);
        renderer.color(bits); renderer.vertex(x1 - nx, y1 - ny, 0);
        renderer.color(bits); renderer.vertex(x2 - nx, y2 - ny, 0);

        renderer.color(bits); renderer.vertex(x1 + nx, y1 + ny, 0);
        renderer.color(bits); renderer.vertex(x2 - nx, y2 - ny, 0);
        renderer.color(bits); renderer.vertex(x2 + nx, y2 + ny, 0);
    }

    public void drawNodeSegment(StickNode node) {
        node.drawLimb(this, 0, 0, 1.0f, false);
    }

    @Override
    public void dispose() {
        renderer.dispose();
    }
}
