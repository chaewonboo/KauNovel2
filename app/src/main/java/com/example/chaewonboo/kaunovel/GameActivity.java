package com.example.chaewonboo.kaunovel;

import android.media.AudioManager;
import android.media.MediaRecorder;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import android.media.AudioManager;
import android.media.SoundPool;


public class GameActivity extends AppCompatActivity {
    int num=0;
    //변수로 만들어줌 버튼 아이디를
    @BindView(R.id.choice_button) Button choiceButton;
    @BindView(R.id.select_button1) Button selectButton1;
    @BindView(R.id.select_button2) Button selectButton2;
    @BindView(R.id.select_button3) Button selectButton3;


    //번튼 숨기기 함수
    private void hide(){
        selectButton1.setVisibility(View.GONE);
        selectButton2.setVisibility(View.GONE);
        selectButton3.setVisibility(View.GONE);
        if(num==1){
            choiceButton.setVisibility(View.GONE);
        }
        else if(num==0){
            choiceButton.setVisibility(View.VISIBLE);
        }
    }
    //버튼
    private void show(){
        selectButton1.setVisibility(View.VISIBLE);
        selectButton2.setVisibility(View.VISIBLE);
        selectButton3.setVisibility(View.VISIBLE);
    }

    int debug=0;
    @OnClick(R.id.select_button1)
    public void selectButtonClicked1() {
        if(debug==0){
            currentScene="#8-1";
        }
        if (currentScene.equals("#8-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#8-1").text);
        }
        if(debug==1){
            currentScene="#3-1";
        }
        if (currentScene.equals("#3-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#3-1").text);
        }
        if(debug==2){
            currentScene="#b-1-1";
        }
        if (currentScene.equals("#b-1-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#b-1-1").text);
        }
        if(debug==3){
            currentScene="#c-1-1";
        }
        if (currentScene.equals("#c-1-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#c-1-1").text);
        }
        if(debug==4){
            currentScene="#z-1-1";
        }
        if (currentScene.equals("#z-1-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#z-1-1").text);
        }
        if(debug==5){
            currentScene="#f-1";
        }
        if (currentScene.equals("#f-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#f-1").text);
        }

        debug+=1;

    }

    @OnClick(R.id.select_button2)
    public void setSelectButtonClicked2(){
        if(debug==0){
            currentScene="#9-1";
        }
        if (currentScene.equals("#9-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#9-1").text);
        }
        if(debug==1){
            currentScene="#6-1";
        }
        if (currentScene.equals("#6-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#6-1").text);
        }
        if(debug==2){
            currentScene="#b-2-1";
        }
        if (currentScene.equals("#b-2-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#b-2-1").text);
        }
        if(debug==3){
            currentScene="#c-2-1";
        }
        if (currentScene.equals("#c-2-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#c-2-1").text);
        }
        if(debug==4){
            currentScene="#z-2-1";
        }
        if (currentScene.equals("#z-2-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#z-2-1").text);
        }
        if(debug==5){
            currentScene="#f-2";
        }
        if (currentScene.equals("#f-2")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#f-2").text);
        }

        debug+=1;
    }

    @OnClick(R.id.select_button3)
    public void setSelectButtonClicked3(){
        if(debug==0){
            currentScene="#10-1";
        }
        if (currentScene.equals("#10-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#10-1").text);
        }
        if(debug==1){
            currentScene="#5-1";
        }
        if (currentScene.equals("#5-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#5-1").text);
        }
        if(debug==2){
            currentScene="#b-3-1";
        }
        if (currentScene.equals("#b-3-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#b-3-1").text);
        }
        if(debug==3){
            currentScene="#c-3-1";
        }
        if (currentScene.equals("#c-3-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#c-3-1").text);
        }
        if(debug==4){
            currentScene="#z-3-1";
        }
        if (currentScene.equals("#z-3-1")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#z-3-1").text);
        }
        if(debug==5){
            currentScene="#f-3";
        }
        if (currentScene.equals("#f-3")){
            num-=1;
            hide();
            choiceButton.setText(sceneData.GetScene("#f-3").text);
        }

        debug+=1;
    }

    @OnClick(R.id.choice_button)
    public void choiceButtonClicked() {


        if (currentScene.equals("#0")) {
            currentScene = "#1";
        }
        else if (currentScene.equals("#1")) {
            currentScene = "#2";
        }
        else if (currentScene.equals("#2")) {
            currentScene = "#3";
        }
        else if (currentScene.equals("#3")) {
            currentScene = "#4";
        }
        else if (currentScene.equals("#4")) {
            currentScene = "#4-1";
        }
        else if (currentScene.equals("#4-1")) {
            currentScene = "#4-2";
        }
        else if (currentScene.equals("#4-2")) {
            currentScene = "#4-3";
        }
        else if (currentScene.equals("#4-3")) {
            currentScene = "#4-4";
        }
        else if (currentScene.equals("#4-4")) {
            currentScene = "#4-5";
        }
        else if (currentScene.equals("#4-5")) {
            currentScene = "#4-6";
        }
        else if (currentScene.equals("#4-6")) {
            currentScene = "#5";
        }
        else if (currentScene.equals("#5")) {
            currentScene = "#6";
        }
        else if (currentScene.equals("#6")) {
            currentScene = "#7";
        }
        else if (currentScene.equals("#7")){
            show();
            selectButton1.setText(sceneData.GetScene("#7-1").text);
            selectButton2.setText(sceneData.GetScene("#7-2").text);
            selectButton3.setText(sceneData.GetScene("#7-3").text);
        }
        else if(currentScene.equals("#8-1")){
            choiceButton.setText(sceneData.GetScene("#8-1").text);
            currentScene="#8-2";
        }

        else if (currentScene.equals("#8-2")){
            choiceButton.setText(sceneData.GetScene("#8-2").text);
            currentScene = "#8-3";
        }

        else if (currentScene.equals("#8-3")){
            choiceButton.setText(sceneData.GetScene("#8-3").text);
            currentScene = "#8-4";
        }

        else if (currentScene.equals("#8-4")){
            choiceButton.setText(sceneData.GetScene("#8-4").text);
            currentScene = "#8-5";
        }

        else if (currentScene.equals("#8-5")){
            choiceButton.setText(sceneData.GetScene("#8-5").text);
        }
        //-----------------
        else if (currentScene.equals("#9-1")){
            choiceButton.setText(sceneData.GetScene("#9-1").text);
            currentScene = "#9-2";
        }
        else if (currentScene.equals("#9-2")){
            choiceButton.setText(sceneData.GetScene("#9-2").text);
            currentScene = "#9-3";
        }
        else if (currentScene.equals("#9-3")){
            choiceButton.setText(sceneData.GetScene("#9-3").text);
            currentScene = "#9-4";
        }
        else if (currentScene.equals("#9-4")){
            choiceButton.setText(sceneData.GetScene("#9-4").text);
            currentScene = "#9-5";
        }
        else if (currentScene.equals("#9-5")){
            choiceButton.setText(sceneData.GetScene("#9-5").text);
            currentScene = "#9-6";
        }
        else if (currentScene.equals("#9-6")){
            choiceButton.setText(sceneData.GetScene("#9-6").text);
            currentScene = "#9-7";
        }
        else if (currentScene.equals("#9-7")){
            choiceButton.setText(sceneData.GetScene("#9-7").text);
            currentScene = "#9-8";
        }
        else if (currentScene.equals("#9-8")){
            choiceButton.setText(sceneData.GetScene("#9-8").text);
            currentScene = "#9-9";
        }
        else if (currentScene.equals("#9-9")){
            choiceButton.setText(sceneData.GetScene("#9-9").text);
            currentScene = "#9-10";
        }
        //-------------------
        //새로운 3개 선택지 //  ------------------



        else if (currentScene.equals("#10-1")){
            choiceButton.setText(sceneData.GetScene("#10-1").text);
            currentScene = "#10-2";
        }
        else if (currentScene.equals("#10-2")){
            choiceButton.setText(sceneData.GetScene("#10-2").text);
            currentScene = "#10-3";
        }
        else if (currentScene.equals("#10-3")){
            choiceButton.setText(sceneData.GetScene("#10-3").text);
            currentScene = "#10-4";
        }
        else if (currentScene.equals("#10-4")){
            choiceButton.setText(sceneData.GetScene("#10-4").text);
            currentScene = "#10-5";
        }
        else if (currentScene.equals("#10-5")){
            choiceButton.setText(sceneData.GetScene("#10-5").text);
            currentScene = "#10-6";
        }
        else if (currentScene.equals("#10-6")){
            choiceButton.setText(sceneData.GetScene("#10-6").text);
            currentScene = "#10-7";
        }
        else if (currentScene.equals("#10-7")){
            choiceButton.setText(sceneData.GetScene("#10-7").text);
            currentScene = "#10-8";
        }
        else if (currentScene.equals("#10-8")){
            choiceButton.setText(sceneData.GetScene("#10-8").text);
            currentScene = "#10-9";
        }
        else if (currentScene.equals("#10-9")){
            choiceButton.setText(sceneData.GetScene("#10-9").text);
            currentScene = "#10-10";
        }
        else if (currentScene.equals("#10-10")){
            choiceButton.setText(sceneData.GetScene("#10-10").text);
        }

        else if (currentScene.equals("#9-10")){
            show();
            selectButton1.setText(sceneData.GetScene("#2-1").text);
            selectButton2.setText(sceneData.GetScene("#2-2").text);
            selectButton3.setText(sceneData.GetScene("#2-3").text);
        }

        else if (currentScene.equals("#3-1")){
            choiceButton.setText(sceneData.GetScene("#3-1").text);
            currentScene = "#3-2";
        }
        else if (currentScene.equals("#3-2")){
            choiceButton.setText(sceneData.GetScene("#3-2").text);
            currentScene = "#3-3";
        }
        else if (currentScene.equals("#3-3")){
            choiceButton.setText(sceneData.GetScene("#3-3").text);
            currentScene = "#3-4";
        }
        else if (currentScene.equals("#3-4")){
            choiceButton.setText(sceneData.GetScene("#3-4").text);
            currentScene = "#3-5";
        }
        else if (currentScene.equals("#3-5")){
            choiceButton.setText(sceneData.GetScene("#3-5").text);
            currentScene = "#0-0";
        }
        //포인터 양과의 대화!!!!!
        //----------------------------------------
        //3-5와 0-0이 연결임!!!!---------------------

        else if (currentScene.equals("#0-0")){
            choiceButton.setText(sceneData.GetScene("#0-0").text);
            currentScene = "#0-1";
        }
        else if (currentScene.equals("#0-1")){
            choiceButton.setText(sceneData.GetScene("#0-1").text);
            currentScene = "#0-1-1";
        }
        else if (currentScene.equals("#0-1-1")){
            choiceButton.setText(sceneData.GetScene("#0-1-1").text);
            currentScene = "#0-2";
        }
        else if (currentScene.equals("#0-2")){
            choiceButton.setText(sceneData.GetScene("#0-2").text);
            currentScene = "#0-3";
        }
        else if (currentScene.equals("#0-3")){
            choiceButton.setText(sceneData.GetScene("#0-3").text);
            currentScene = "#0-4";
        }
        else if (currentScene.equals("#0-4")){
            choiceButton.setText(sceneData.GetScene("#0-4").text);
            currentScene = "#0-5";
        }
        else if (currentScene.equals("#0-5")){
            choiceButton.setText(sceneData.GetScene("#0-5").text);
            currentScene = "#0-6";
        }
        else if (currentScene.equals("#0-6")){
            choiceButton.setText(sceneData.GetScene("#0-6").text);
            currentScene = "#0-7";
        }
        else if (currentScene.equals("#0-7")){
            choiceButton.setText(sceneData.GetScene("#0-7").text);
            currentScene = "#0-8";
        }
        else if (currentScene.equals("#0-8")){
            choiceButton.setText(sceneData.GetScene("#0-8").text);
            currentScene = "#0-9";
        }
        else if (currentScene.equals("#0-9")){
            choiceButton.setText(sceneData.GetScene("#0-9").text);
            currentScene = "#0-10";
        }
        else if (currentScene.equals("#0-10")){
            choiceButton.setText(sceneData.GetScene("#0-10").text);
            currentScene = "#0-11";
        }
        else if (currentScene.equals("#0-11")){
            choiceButton.setText(sceneData.GetScene("#0-11").text);
            currentScene = "#0-12";
        }
        else if (currentScene.equals("#0-12")){
            choiceButton.setText(sceneData.GetScene("#0-12").text);
            currentScene = "#0-13";
        }
        else if (currentScene.equals("#0-13")){
            choiceButton.setText(sceneData.GetScene("#0-13").text);
            currentScene = "#0-14";
        }
        else if (currentScene.equals("#0-14")){
            show();
            selectButton1.setText(sceneData.GetScene("#z-1").text);
            selectButton2.setText(sceneData.GetScene("#z-2").text);
            selectButton3.setText(sceneData.GetScene("#z-3").text);
        }

        else if (currentScene.equals("#z-1-1")){
            choiceButton.setText(sceneData.GetScene("#z-1-1").text);
            currentScene = "#z-1-2";
        }
        else if (currentScene.equals("#z-1-2")){
            choiceButton.setText(sceneData.GetScene("#z-1-2").text);
            currentScene = "#z-1-3";
        }
        else if (currentScene.equals("#z-1-3")){
            choiceButton.setText(sceneData.GetScene("#z-1-3").text);
            currentScene ="#z-1-4";
        }
        else if (currentScene.equals("#z-1-4")){
            choiceButton.setText(sceneData.GetScene("#z-1-4").text);
            currentScene = "#f-0";
        }


        else if (currentScene.equals("#z-2-1")){
            choiceButton.setText(sceneData.GetScene("#z-2-1").text);
            currentScene = "#z-2-2";
        }
        else if (currentScene.equals("#z-2-2")){
            choiceButton.setText(sceneData.GetScene("#z-2-2").text);
            currentScene = "#z-2-3";
        }
        else if (currentScene.equals("#z-2-3")){
            choiceButton.setText(sceneData.GetScene("#z-2-3").text);
            currentScene ="#z-2-4";
        }
        else if (currentScene.equals("#z-2-4")){
            choiceButton.setText(sceneData.GetScene("#z-2-4").text);
            currentScene = "#f-0";
        }

        else if (currentScene.equals("#z-3-1")){
            choiceButton.setText(sceneData.GetScene("#z-3-1").text);
            currentScene = "#z-3-2";
        }
        else if (currentScene.equals("#z-3-2")){
            choiceButton.setText(sceneData.GetScene("#z-3-2").text);
            currentScene = "#z-3-3";
        }
        else if (currentScene.equals("#z-3-3")){
            choiceButton.setText(sceneData.GetScene("#z-3-3").text);;
        }
        else if (currentScene.equals("#f-0")){
            choiceButton.setText(sceneData.GetScene("#f-0").text);
            currentScene = "#f-0-0";
        }
        else if (currentScene.equals("#f-0-0")){
            show();
            selectButton1.setText(sceneData.GetScene("#f-1").text);
            selectButton2.setText(sceneData.GetScene("#f-2").text);
            selectButton3.setText(sceneData.GetScene("#f-3").text);
        }
        //마지막 결말.....---------------------------------------------------------------
        else if (currentScene.equals("#f-1")){
            choiceButton.setText(sceneData.GetScene("#f-1").text);
            currentScene = "#f-1-1";
        }
        else if (currentScene.equals("#f-1-1")){
            choiceButton.setText(sceneData.GetScene("#f-1-1").text);
            currentScene = "#f-1-2";
        }
        else if (currentScene.equals("#f-1-2")){
            choiceButton.setText(sceneData.GetScene("#f-1-2").text);
            currentScene = "#f-1-3";
        }
        else if (currentScene.equals("#f-1-3")){
            choiceButton.setText(sceneData.GetScene("#f-1-3").text);
            currentScene = "#f-1-4";
        }
        else if (currentScene.equals("#f-1-4")){
            choiceButton.setText(sceneData.GetScene("#f-1-4").text);
            currentScene = "#f-1-5";
        }
        else if (currentScene.equals("#f-1-5")){
            choiceButton.setText(sceneData.GetScene("#f-1-5").text);
            currentScene = "#f-1-6";
        }
        else if (currentScene.equals("#f-1-6")){
            choiceButton.setText(sceneData.GetScene("#f-1-6").text);
            currentScene = "#f-1-7";
        }
        else if (currentScene.equals("#f-1-7")){
            choiceButton.setText(sceneData.GetScene("#f-1-7").text);
            currentScene = "#f-1-8";
        }
        else if (currentScene.equals("#f-1-8")){
            choiceButton.setText(sceneData.GetScene("#f-1-8").text);
        }

        else if (currentScene.equals("#f-2")){
            choiceButton.setText(sceneData.GetScene("#f-2").text);
            currentScene = "#f-2-1";
        }
        else if (currentScene.equals("#f-2-1")){
            choiceButton.setText(sceneData.GetScene("#f-2-1").text);
            currentScene = "#f-2-2";
        }
        else if (currentScene.equals("#f-2-2")){
            choiceButton.setText(sceneData.GetScene("#f-2-2").text);
            currentScene = "#f-2-3";
        }
        else if (currentScene.equals("#f-2-3")){
            choiceButton.setText(sceneData.GetScene("#f-2-3").text);
            currentScene = "#f-2-4";
        }
        else if (currentScene.equals("#f-2-4")){
            choiceButton.setText(sceneData.GetScene("#f-2-4").text);
            currentScene = "#f-2-5";
        }
        else if (currentScene.equals("#f-2-5")){
            choiceButton.setText(sceneData.GetScene("#f-2-5").text);
            currentScene = "#f-2-6";
        }
        else if (currentScene.equals("#f-2-6")){
            choiceButton.setText(sceneData.GetScene("#f-2-6").text);
            currentScene = "#f-2-7";
        }
        else if (currentScene.equals("#f-2-7")){
            choiceButton.setText(sceneData.GetScene("#f-2-7").text);
            currentScene = "#f-2-8";
        }
        else if (currentScene.equals("#f-2-8")){
            choiceButton.setText(sceneData.GetScene("#f-2-8").text);
        }

        else if (currentScene.equals("#f-3")){
            choiceButton.setText(sceneData.GetScene("#f-3").text);
            currentScene = "#f-3-1";
        }
        else if (currentScene.equals("#f-3-1")){
            choiceButton.setText(sceneData.GetScene("#f-3-1").text);
            currentScene = "#f-3-2";
        }
        else if (currentScene.equals("#f-3-2")){
            choiceButton.setText(sceneData.GetScene("#f-3-2").text);
            currentScene = "#f-3-3";
        }
        else if (currentScene.equals("#f-3-3")){
            choiceButton.setText(sceneData.GetScene("#f-3-4").text);
        }

        //2번째 선택지에서 3번선택
        else if (currentScene.equals("#5-1")){
            choiceButton.setText(sceneData.GetScene("#5-1").text);
            currentScene = "#5-2";
        }
        else if (currentScene.equals("#5-2")){
            choiceButton.setText(sceneData.GetScene("#5-2").text);
            currentScene = "#5-3";
        }
        else if (currentScene.equals("#5-3")){
            choiceButton.setText(sceneData.GetScene("#5-3").text);
            currentScene = "#5-4";
        }
        else if (currentScene.equals("#5-4")){
            choiceButton.setText(sceneData.GetScene("#5-4").text);
            currentScene = "#5-5";
        }
        else if (currentScene.equals("#5-5")){
            choiceButton.setText(sceneData.GetScene("#5-5").text);
            currentScene = "#5-6";
        }
        else if (currentScene.equals("#5-6")){
            choiceButton.setText(sceneData.GetScene("#5-6").text);
            currentScene = "#5-7";
        }
        else if (currentScene.equals("#5-7")){
            choiceButton.setText(sceneData.GetScene("#5-7").text);
            currentScene = "#5-8";
        }
        else if (currentScene.equals("#5-8")){
            choiceButton.setText(sceneData.GetScene("#5-8").text);
            currentScene = "#5-9";
        }
        else if (currentScene.equals("#5-9")){
            choiceButton.setText(sceneData.GetScene("#5-9").text);
        }

        else if (currentScene.equals("#6-1")){
            choiceButton.setText(sceneData.GetScene("#6-1").text);
            currentScene = "#6-2";
        }
        else if (currentScene.equals("#6-2")){
            choiceButton.setText(sceneData.GetScene("#6-2").text);
            currentScene = "#6-3";
        }
        else if (currentScene.equals("#6-3")){
            choiceButton.setText(sceneData.GetScene("#6-3").text);
            currentScene = "#6-4";
        }
        else if (currentScene.equals("#6-4")){
            choiceButton.setText(sceneData.GetScene("#6-4").text);
            currentScene = "#6-5";
        }
        else if (currentScene.equals("#6-5")){
            choiceButton.setText(sceneData.GetScene("#6-5").text);
            currentScene = "#6-6";
        }
        else if (currentScene.equals("#6-6")){
            choiceButton.setText(sceneData.GetScene("#6-6").text);
            currentScene = "#6-7";
        }
        else if (currentScene.equals("#6-7")){
            choiceButton.setText(sceneData.GetScene("#6-7").text);
            currentScene = "#6-8";
        }
        else if (currentScene.equals("#6-8")){
            choiceButton.setText(sceneData.GetScene("#6-8").text);
            currentScene = "#6-9";
        }
        else if (currentScene.equals("#6-9")){
            choiceButton.setText(sceneData.GetScene("#6-9").text);
            currentScene = "#6-10";
        }
        else if (currentScene.equals("#6-10")){
            choiceButton.setText(sceneData.GetScene("#6-10").text);
            currentScene = "#6-11";
        }
        else if (currentScene.equals("#6-11")){
            choiceButton.setText(sceneData.GetScene("#6-11").text);
            currentScene = "#6-12";
        }
        else if (currentScene.equals("#6-12")){
            choiceButton.setText(sceneData.GetScene("#6-12").text);
            currentScene = "#6-13";
        }
        else if (currentScene.equals("#6-13")){
            choiceButton.setText(sceneData.GetScene("#6-13").text);
            currentScene = "#6-14";
        }
        else if (currentScene.equals("#6-14")){
            choiceButton.setText(sceneData.GetScene("#6-14").text);
            currentScene = "#6-15";
        }
        else if (currentScene.equals("#6-15")){
            choiceButton.setText(sceneData.GetScene("#6-15").text);
            currentScene = "#6-16";
        }
        else if (currentScene.equals("#6-16")){
            choiceButton.setText(sceneData.GetScene("#6-16").text);
            currentScene = "#a-1";
        }

        //신입생 프라이베잇과 대화----------------------------
        //6-16에서 ㄱ-1로 이어짐----------------------------
        else if (currentScene.equals("#a-1")){
            choiceButton.setText(sceneData.GetScene("#a-1").text);
            currentScene = "#a-2";
        }
        else if (currentScene.equals("#a-2")){
            choiceButton.setText(sceneData.GetScene("#a-2").text);
            currentScene = "#a-3";
        }
        else if (currentScene.equals("#a-3")){
            choiceButton.setText(sceneData.GetScene("#a-3").text);
            currentScene = "#a-4";
        }
        else if (currentScene.equals("#a-4")){
            choiceButton.setText(sceneData.GetScene("#a-4").text);
            currentScene = "#a-5";
        }
        else if (currentScene.equals("#a-5")){
            choiceButton.setText(sceneData.GetScene("#a-5").text);
            currentScene = "#a-6";
        }
        else if (currentScene.equals("#a-6")){
            choiceButton.setText(sceneData.GetScene("#a-6").text);
            currentScene = "#a-7";
        }
        else if (currentScene.equals("#a-7")){
            choiceButton.setText(sceneData.GetScene("#a-7").text);
            currentScene = "#a-8";
        }
        else if (currentScene.equals("#a-8")){
            choiceButton.setText(sceneData.GetScene("#a-8").text);
            currentScene = "#a-9";
        }
        else if (currentScene.equals("#a-9")){
            choiceButton.setText(sceneData.GetScene("#a-9").text);
            currentScene = "#a-10";
        }
        else if (currentScene.equals("#a-10")){
            choiceButton.setText(sceneData.GetScene("#a-10").text);
            currentScene = "#a-11";
        }
        else if (currentScene.equals("#a-11")){
            choiceButton.setText(sceneData.GetScene("#a-11").text);
            currentScene = "#a-12";
        }
        else if (currentScene.equals("#a-12")){
            choiceButton.setText(sceneData.GetScene("#a-12").text);
            currentScene = "#a-13";
        }
        else if (currentScene.equals("#a-13")){
            choiceButton.setText(sceneData.GetScene("#a-13").text);
            currentScene ="#a-14";
        }
        else if (currentScene.equals("#a-14")){
            show();
            selectButton1.setText(sceneData.GetScene("#b-1").text);
            selectButton2.setText(sceneData.GetScene("#b-2").text);
            selectButton3.setText(sceneData.GetScene("#b-3").text);
        }
        else if (currentScene.equals("#b-1-1")){
            choiceButton.setText(sceneData.GetScene("#b-1-1").text);
            currentScene ="#b-1-2";
        }
        else if (currentScene.equals("#b-1-2")){
            choiceButton.setText(sceneData.GetScene("#b-1-2").text);
        }
        else if (currentScene.equals("#b-3-1")){
            choiceButton.setText(sceneData.GetScene("#b-3-1").text);
            currentScene ="#b-3-2";
        }
        else if (currentScene.equals("#b-3-2")){
            choiceButton.setText(sceneData.GetScene("#b-3-2").text);
        }
        else if (currentScene.equals("#b-2-1")){
            choiceButton.setText(sceneData.GetScene("#b-2-1").text);
            currentScene ="#b-4";
        }
        else if (currentScene.equals("#b-4")){
            choiceButton.setText(sceneData.GetScene("#b-4").text);
            currentScene ="#b-5";
        }
        else if (currentScene.equals("#b-5")){
            choiceButton.setText(sceneData.GetScene("#b-5").text);
            currentScene ="#b-6";
        }
        else if (currentScene.equals("#b-6")){
            choiceButton.setText(sceneData.GetScene("#b-6").text);
            currentScene ="#b-7";
        }
        else if (currentScene.equals("#b-7")){
            choiceButton.setText(sceneData.GetScene("#b-7").text);
            currentScene ="#b-8";
        }
        else if (currentScene.equals("#b-8")){
            show();
            selectButton1.setText(sceneData.GetScene("#c-1").text);
            selectButton2.setText(sceneData.GetScene("#c-2").text);
            selectButton3.setText(sceneData.GetScene("#c-3").text);
        }
        else if (currentScene.equals("#c-2-1")){
            choiceButton.setText(sceneData.GetScene("#c-2-1").text);
            currentScene ="#c-2-2";
        }
        else if (currentScene.equals("#c-2-2")){
            choiceButton.setText(sceneData.GetScene("#c-2-2").text);
            currentScene ="#c-2-3";
        }
        else if (currentScene.equals("#c-2-3")){
            choiceButton.setText(sceneData.GetScene("#c-2-3").text);
        }

        else if (currentScene.equals("#c-3-1")){
            choiceButton.setText(sceneData.GetScene("#c-3-1").text);
            currentScene ="#c-3-2";
        }
        else if (currentScene.equals("#c-3-2")){
            choiceButton.setText(sceneData.GetScene("#c-3-2").text);
            currentScene ="#c-3-3";
        }
        else if (currentScene.equals("#c-3-3")){
            choiceButton.setText(sceneData.GetScene("#c-3-3").text);
        }
        else if (currentScene.equals("#c-1-1")){
            choiceButton.setText(sceneData.GetScene("#c-1-1").text);
            currentScene ="#c-1-2";
        }
        else if (currentScene.equals("#c-1-2")){
            choiceButton.setText(sceneData.GetScene("#c-1-2").text);
            currentScene ="#c-1-3";
        }
        else if (currentScene.equals("#c-1-3")){
            choiceButton.setText(sceneData.GetScene("#c-1-3").text);
            currentScene ="#c-1-4";
        }
        else if (currentScene.equals("#c-1-4")){
            choiceButton.setText(sceneData.GetScene("#c-1-4").text);
            currentScene ="#c-1-5";
        }
        else if (currentScene.equals("#c-1-5")){
            choiceButton.setText(sceneData.GetScene("#c-1-5").text);
            currentScene ="#c-1-6";
        }
        else if (currentScene.equals("#c-1-6")){
            choiceButton.setText(sceneData.GetScene("#c-1-6").text);
            currentScene ="#c-1-7";
        }
        else if (currentScene.equals("#c-1-7")){
            choiceButton.setText(sceneData.GetScene("#c-1-7").text);
            currentScene ="#0-1-1";
        }



        Scene scene = sceneData.GetScene(currentScene);
        choiceButton.setText(scene.text);
        getWindow().getDecorView().setBackground(scene.background);
    }

    SceneData sceneData = new SceneData();

    String currentScene;
    //select button1 진행 변수
    String currentScene1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ButterKnife.bind(this);
        hide();
        buildStory();

        currentScene = "#0";
    }
    //3번째꺼가 바꿔
    private void buildStory() {
        sceneData.CreateScene("#1", new Scene("수상한 고양이 : 야옹 (야 ! 야 !)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#2", new Scene("나: 이게 무슨소리지??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#3", new Scene("수상한 고양이: 야야양야ㅑ야양아아아아아아앙ㅇㅇ (너 내말이 들리니?)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4", new Scene("나: 뭐야 이 고양이! 말을 하잖아!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        //
        sceneData.CreateScene("#4-1", new Scene("수상한 고양이 : 후후 내말이 들리는걸 보니 당신 진성 공대생 이로군",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-2", new Scene("수상한 고양이 : 보아하니 여자인 친구도 한명도 없겠군",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-3", new Scene("나: 무슨소리야!! (당황당황)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-4", new Scene("수상한 고양이 : 당신이 내 고민을 해결해 준다면 공대 인기남으로 만들어 줄수도 있는데 후후",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-5", new Scene("나: 어.? 고민이 뭔데???(솔깃)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#4-6", new Scene("수상한 고양이 : 고민을 말하기 전에 먹은게 없어서 힘이 없군..",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        //
        sceneData.CreateScene("#5", new Scene("수상한 고양이: 닝겐 혹시 먹을것이 있는가? ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#6", new Scene("수상한 고양이: 짐이 배가 고파서 말이지..",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#7", new Scene("나: 뭐가 있으려나 (주섬주섬)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        num+=1;
        //음식 선택 하는걸 만들고 싶다 본격적 질문지
        sceneData.CreateScene("#7-1", new Scene("청산가리",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#7-2", new Scene("양성자, 중성자 패밀리팩",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#7-3", new Scene("평범한 참치캔",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        // 7-1 선택시  실행
        sceneData.CreateScene("#8-1", new Scene("나: 자! 푸른빛이 도는 싱싱한 청산가리야!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-2", new Scene("수상한 고양이 : 끼에에에에야야야야냐냐냐냐냥 !!!!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-3", new Scene("나: 어 어어!! 왜그래 냥이야! (당황하면서)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-3", new Scene("수상한 고양이 : 너도 다른사람들이랑 똑같냥!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-4", new Scene("수상한 고양이 : 넌 나에게 말을걸 자격이 없당!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#8-5", new Scene("GAME OVER.....!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        // 7-2 선택시 실행
        sceneData.CreateScene("#9-1", new Scene("나: 요즘 공대 신상 햄버거 쿼크버거야!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-2", new Scene("수상한 고양이 : 오호라 흥미러운 음식을 주는 닝.겐.이.군.! 후후..!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-3", new Scene("수상한 고양이 : 이정도의 음식 센스를 가진 사람이라면 내 고민을 들어줄수 있겠군.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        //
        sceneData.CreateScene("#9-4", new Scene("나: 그래서 너의 정체가 뭐야!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-5", new Scene("수상한 고양이 : 후후 자기소개의 시간인가.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-6", new Scene("수상한 고양이 : 이몸으로 말하자면 나는 공대의 귀염둥이!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-7", new Scene("수상한 고양이 : 공대의 수호신!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-8", new Scene("슈뢰딩거의 고양이 : 슈뢰딩거의 고양이댱!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-9", new Scene("나 : 역시 이런 이상한 공대따위 오는게 아니였어..",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#9-10", new Scene("나 : 어어..?(이런 수업이 늦겠잖어 어쩌지;;;)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        //선택지

        //스토리 선택지 새롭게


        // 7-3 선택시 실행
        sceneData.CreateScene("#10-1", new Scene("나: 자 여기~(크크 고양이들 이라면 환장하는 참치캔을 주지)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-2", new Scene("수상한 고양이 : 오호 무슨 음식이냥~",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-3", new Scene("나 : (크크크크 아주 좋아죽을꺼야 쿸쿸쿸)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-4", new Scene("수상한 고양이 : 뭐야 이거 참치캔이잖아!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-5", new Scene("나 : 호호 맘에 들지~?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-6", new Scene("수상한 고양이 : 어디 이런 저급한 음식을 들이대는거냥!!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-7", new Scene("나 : 응..? (뭐야 이게 아닌데!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-8", new Scene("수상한 고양이 : 이몸이 누군지 알고!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-9", new Scene("수상한 고양이 : 썩 꺼지거냥!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#10-10", new Scene("GAME OVER....",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        //두번째 선택지..
        sceneData.CreateScene("#2-1", new Scene("1. 수업에 늦어서 수업을 간다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#2-2", new Scene("2. 고양이의 말을 계속 듣는다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#2-3", new Scene("3. 고양이가 쉬도록 박스를 덮어준다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        sceneData.CreateScene("#3-1", new Scene("나: 어어..? 난 수업이 늦어서 가봐야 할꺼같어!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#3-2", new Scene("슈뢰딩거의 고양이 : 어리석은 닝겐이여...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#3-3", new Scene("슈뢰딩거의 고양이 : 나의 가호를 버리는구나...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#3-4", new Scene("나: 이상한 고양이 때문에 수업에 늦었잖어 ㅡ.ㅡ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#3-5", new Scene("다다다다다 (교실로 뛰어 간다.)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        //
        sceneData.CreateScene("#5-1", new Scene("나: (고양이들이 그러헥 박스를 좋아한다지!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-2", new Scene("슈뢰딩거의 고양이 : 잠깐 잠깐! 닝겐 무엇을 하는것이냐!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-3", new Scene("나: 고양이야 자외선이 강하니 박스로 그늘을 피하렴 ^^",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-4", new Scene("슈뢰딩거의 고양이 : 아아아 앙댄다냥!!!!!!!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-5", new Scene("슈뢰딩거의 고양이 : 끼냥!!! (고양이가 박스로 들어갔다)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-6", new Scene("슈뢰딩거의 방정식이 발동했다!!!. ",
               ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-7", new Scene("고양이가 50% 확률로 죽을지도 모른다. ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-8", new Scene("공대의 수호신을 죽인거같다...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#5-9", new Scene("GAME OVER......",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));

        //스토리 진행을 위한 선택시

        sceneData.CreateScene("#6-1", new Scene("나: 그래 고민이 뭐묘? (오늘 수업은 무시하자!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-2", new Scene("슈뢰딩거의 고양이 : 난 박스를 정말 싫어해!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-3", new Scene("나: 고양이들은 박스를 다 좋아하지 않어??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-4", new Scene("슈뢰딩거의 고양이 : 아니다냥! 난 슈뢰딩거의 공양이라 박스를 덮으면 죽을지도 모른다냥!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-5", new Scene("나: (헉! 아까 잘못했으면 박스를 덮을뻔했는데!!!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-6", new Scene("나: 휴...(다행이다)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-7", new Scene("나: 그러면 앞으로 내가 박스로 부터 널 지켜줄께!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-8", new Scene("슈뢰딩거의 고양이 : 참으로 착한 공대생이군",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-9", new Scene("슈뢰딩거의 고양이 : 내이야기도 들을수 있고 너에게 축복을 주마!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-10", new Scene("(슈뢰딩거 고양이의 축복을 받았다.)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-11", new Scene("슈뢰딩거의 고양이 : 공대의 힘이 함께하길...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-12", new Scene("나: 뭐야! 고양이가 어디갔지??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cat),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.start)));
        sceneData.CreateScene("#6-13", new Scene("(카톡왔졍 카톡왔쪙!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#6-14", new Scene("나 : 어 나한테 카톡이 오다니 무슨일이지....?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#6-15", new Scene("17신입생 : 오빠 뭐해용~~~??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.kakao),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.kakao)));
        sceneData.CreateScene("#6-16", new Scene("TO BE COUNTINUE...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.kakao),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.kakao)));


        //신입생 이야기 가 이어진다. 신입생 스토리는 "#ㄱ-1" 부터 시작한다.
        //---------------------------------------------------------
        sceneData.CreateScene("#a-1", new Scene("휴 시작부터 힘든 하루야...(터벅터벅)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.bok),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.bok)));
        sceneData.CreateScene("#a-2", new Scene("(털썩) 앉아서 코딩이나 해야지ㅜㅜ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#a-3", new Scene("툭툭 (누군가 어깨를 톡톡 친다.)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#a-4", new Scene("17 신입생 : 오빠!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-5", new Scene("나 : 어..어 누구였지 ?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-6", new Scene("17 신입생 : 흥! 저 기억 안나요??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-7", new Scene("17 신입생 : 저번에 같이 술마셨잖아요!, 고양이도 보고!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-8", new Scene("나 : (뭐지 기억안나는데 슈뢰딩거 고양이인가??) ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-9", new Scene("나 : 어 어 그래 안녕!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-10", new Scene("17 신입생 : 약속 기억하시죠? 커피사줘요!!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-11", new Scene("나 : 아..아니 내가 그랬나,,,?? (와 이쁘다!)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-12", new Scene("나 : 그건 그렇고 넌 이름이 뭐니?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-13", new Scene("17 신입생 : 뭐게용~",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#a-14", new Scene("선택하기.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));

        //신입생 선택지-------------------------
        //-----------------------------------

        sceneData.CreateScene("#b-1", new Scene("1. fm fm fm fm fm어이! fm 어이",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#b-2", new Scene("2. 음.. 혹시 using namespace?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#b-3", new Scene("3. 뀨 >< 모르겠쟝! ><",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));

        sceneData.CreateScene("#b-1-1", new Scene("안녕 안녕 안녕하십니까!... 창피해요..",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#b-1-2", new Scene("GAME OVER.....",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));

        sceneData.CreateScene("#b-2-1", new Scene("17 신입생 : (꺄륵) 어! 연관성이 있어요 ^^",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));

        sceneData.CreateScene("#b-3-1", new Scene("17 신입생 : 화석이 애교를 극혐!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#b-3-2", new Scene("GAME OVER......",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        //b-2-1 선택시 대사 만들기!
        sceneData.CreateScene("#b-4", new Scene("제어자 : 전 소학 신입생 제어자 라고 해요 ^^",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#b-5", new Scene("나 : 아하! 어자 정말 이쁜 이름이다 ^^",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#b-6", new Scene("제어자 : 아 진짜요 ??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#b-7", new Scene("제어자 : 오빠는 이성 취향이 어떻게 되요??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#b-8", new Scene("선택 하기",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));


        sceneData.CreateScene("#c-1", new Scene("1. 난 객체 지향이야 ^^*",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-2", new Scene("2. 난 절차 지향이야 ^^*",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-3", new Scene("3. 난 하드웨어같은 여자를 좋아해 ^^*",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));

        sceneData.CreateScene("#c-2-1", new Scene("제어자 : 으으... 화석답게 옛날 언어쓰시네",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-2-2", new Scene("제어자 : 아는척 하지 말아주세요",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-2-3", new Scene("GAME OVER...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));

        sceneData.CreateScene("#c-3-1", new Scene("제어자 : 소프트 웨어에게 하드웨어를 언급하다니!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-3-2", new Scene("제어자 : 아는척 하지 말아주세요",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-3-3", new Scene("GAME OVER...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));

        sceneData.CreateScene("#c-1-1", new Scene("제어자 : 어머 저랑 취향도 똑같으시네요 ><",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-1-2", new Scene("제어자 : 앞으로도 친하게 지내요 (하트)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-1-3", new Scene("나 : 쿵 (너무 귀여워서 심장에 무리가 왔다)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-1-4", new Scene("나 : 그 그래! 앗 늦었잖아 수업가야겠다!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-1-5", new Scene("제어자 : 오니짱 잘가요~",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-1-6", new Scene("나 : 그 그래!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.new1)));
        sceneData.CreateScene("#c-1-7", new Scene("나 : 두두두두두(자바 수업으로 뛰어간다)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));

        //3-5 슈레딩거 고양이 1번선택지 축복없을 경우 선택시
        sceneData.CreateScene("#0-0", new Scene("축복을 받지 못해 신입생에게 말걸 용기가 사라졌다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#0-1", new Scene("고양이 학점 : b0",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#0-1-1", new Scene("교실 문을 열었다 (드르륵)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#0-2", new Scene("김교수님 : 자 자바에서 메모리 구조는!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul)));
        sceneData.CreateScene("#0-3", new Scene("김교수님 : 공대생학생 지각입니다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul)));
        sceneData.CreateScene("#0-4", new Scene("나 : 죄송합니다 교수님 ㅜㅜ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.chul)));
        sceneData.CreateScene("#0-5", new Scene("??? : 너 또 지각이구나 ㅎㅎ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-6", new Scene("나 : 어... 너는??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-7", new Scene("(이녀석은 나의 동기 포인터양 이다.)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-8", new Scene("(누구한테나 밝게 인사를 해주는 착한친구)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-9", new Scene("(나같은 아싸한테도 말을 걸어주는구나..)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-10", new Scene("포인터양 : 방학은 잘 보냈어??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-11", new Scene("포인터양 : 방학동안 여자친구는 만들었어?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-12", new Scene("나 : 여 .. 여자친구는 무슨!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-13", new Scene("포인터양 : 그래? 넌 이성취향이 어떻게되니??",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#0-14", new Scene("선택 하기",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));

        sceneData.CreateScene("#z-1", new Scene("1. 객체지향 이야! ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-2", new Scene("2. 절차지향 이야! ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-3", new Scene("3. 하드웨어 취향이야! ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));

        sceneData.CreateScene("#z-1-1", new Scene("포인터양 : 신입생이랑 놀더니 이상해졌구나..",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-1-2", new Scene("포인터양 : 그래 c언어 같은 절차지향은 별로지 ㅜㅜ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-1-3", new Scene("나 : 아 아니야 그런말이 ㅋㅋㅋㅋ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-1-4", new Scene("포인터양 : ㅋㅋㅋ 그랭 , 그건그렇고 내일 뭐해?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));

        sceneData.CreateScene("#z-2-1", new Scene("포인터양 : 역시 넌 뭘좀 아는구나!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-2-2", new Scene("포인터양 : i love c language!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-2-3", new Scene("나 : 응... 그래 ㅋㅋ;;",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-2-4", new Scene("포인터양 : ㅋㅋㅋ 그랭 , 그건그렇고 내일 뭐해?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));


        sceneData.CreateScene("#z-3-1", new Scene("포인터양 : 소프트 웨어에게 하드웨어를 언급하다니!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-3-2", new Scene("포인터양 : 아는척 하지 말아주세요",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#z-3-3", new Scene("GAME OVER...",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));

        sceneData.CreateScene("#f-0", new Scene("나 : 음...뭐할려나?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));

        sceneData.CreateScene("#f-0-0", new Scene("선택 하기",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));

        sceneData.CreateScene("#f-1", new Scene("1. 신입생이랑 놀기러 했지렁~~~ ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#f-2", new Scene("2. 너랑 술마시려고 ㅎㅎㅎ ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#f-3", new Scene("3. 꺼져 코딩할꺼야. ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));

        sceneData.CreateScene("#f-1-1", new Scene("포인터양 : 그래! 넌 항상 그런식이였어!(눈물을 글썽이며)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#f-1-2", new Scene("포인터양 : 으아앙 (울면서 사라진다...)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#f-1-3", new Scene("나 : 인.. 인.. 인터야!!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#f-1-4", new Scene("그렇게 인터는 내앞에 모습을 보인적이 없었다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#f-1-5", new Scene("나는 신입생 제어자와 cc를 하게되었고",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.co),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.co)));
        sceneData.CreateScene("#f-1-6", new Scene("점점 객체지향적 몸에 가까워져서",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.co),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.co)));
        sceneData.CreateScene("#f-1-7", new Scene("김교수님의 자바수업 학점을 a+을 받게된다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.aa),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.aa)));
        sceneData.CreateScene("#f-1-8", new Scene("THE END (MADE BY 1BOO)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));

        sceneData.CreateScene("#f-2-1", new Scene("포인터양 : (얼굴이 붉어지며) 진..진..진짜?",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#f-2-2", new Scene("나 : 그래 술먹으로 가자!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#f-2-3", new Scene("포인터양 : 그래 화씨 고!",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#f-2-4", new Scene("그렇게 동기인 포인터양과 매일 술을 들이마시던 나는",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#f-2-5", new Scene("꿈꾸던 cc는 사라지고 500cc 만이 내 곁에 남았다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.bear),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.bear)));
        sceneData.CreateScene("#f-2-6", new Scene("또한 절차지향의 몸에 익숙해진 나는",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#f-2-7", new Scene("객체지향 프로그래밍인 자바 수업을 b0로 겨우 살아남게 된다.",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#f-2-8", new Scene("THE END..(MADE BY 1BOO)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));

        sceneData.CreateScene("#f-3-1", new Scene("포인터양 : 그래 너답다 ㅉㅉ",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.pointer)));
        sceneData.CreateScene("#f-3-2", new Scene("그렇게 코딩만 하던 나는 평생 코딩만 하게 되었다",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
        sceneData.CreateScene("#f-3-3", new Scene("THE END..(MADE BY 1BOO)",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black),
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.black)));
    }
}
