package com.demo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * User: lanxinghua
 * Date: 2019/3/14 13:20
 * Desc: 自定义插件  name就是我们的goal
 */
@Mojo(name = "one", defaultPhase = LifecyclePhase.PACKAGE)
public class GupaoMojo extends AbstractMojo {

    //参数配置
    @Parameter
    private String msg;

    @Parameter
    private List<String> options;

    @Parameter(property = "args")
    private String args;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException{
        System.out.println("my plugin  !!!" + msg);
        System.out.println("my plugin  !!!" + options);
        System.out.println("my plugin  !!!" + args);
    }
}
