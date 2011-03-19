package com.osesm.pifft;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;

public class PifftCanvas implements ApplicationListener {

  private Mesh mesh;
  private Texture texture;

  @Override
  public void create() {
    if (mesh == null) {
      mesh = new Mesh(true, 3, 3, 
          new VertexAttribute(Usage.Position, 3, "a_position"),
          new VertexAttribute(Usage.ColorPacked, 4, "a_color"),
          new VertexAttribute(Usage.TextureCoordinates, 2, "a_texCoords"));

      mesh.setVertices(new float[] {
          -0.5f, -0.5f, 0, Color.toFloatBits(255, 0, 0, 255), 0, 1,
          0.5f, -0.5f, 0, Color.toFloatBits(0, 255, 0, 255), 1, 1, 
          0, 0.5f, 0, Color.toFloatBits(0, 0, 255, 255), 0.5f, 0 });
      
      mesh.setIndices(new short[] { 0, 1, 2 });
      
      
      FileHandle imageFileHandle = Gdx.files.internal("data/badlogic.jpg");
      texture = new Texture(imageFileHandle);
    }
  }

  @Override
  public void dispose() {
    // TODO Auto-generated method stub

  }

  @Override
  public void pause() {
    // TODO Auto-generated method stub

  }

  @Override
  public void render() {
    Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
    Gdx.graphics.getGL10().glEnable(GL10.GL_TEXTURE_2D);
    texture.bind();
    mesh.render(GL10.GL_TRIANGLES, 0, 3);
  }

  @Override
  public void resize(int arg0, int arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void resume() {
    // TODO Auto-generated method stub

  }

}
